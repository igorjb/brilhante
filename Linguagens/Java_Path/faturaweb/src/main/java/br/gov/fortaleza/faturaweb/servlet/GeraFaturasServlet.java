package br.gov.fortaleza.faturaweb.servlet;

import java.io.IOException;
import java.util.List;

import javax.batch.operations.JobOperator;
import javax.batch.runtime.BatchRuntime;
import javax.batch.runtime.JobExecution;
import javax.batch.runtime.JobInstance;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.gov.fortaleza.faturaweb.dao.IniciadorDeBaseDeTeste;

@WebServlet("/gera-faturas")
public class GeraFaturasServlet extends HttpServlet{

	@Inject
	private IniciadorDeBaseDeTeste iniciador;
	
	@Override
	public void init() throws ServletException{
		super.init();
		iniciador.iniciaEstadoDaBase();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		JobOperator jobOperator = BatchRuntime.getJobOperator();
		jobOperator.start("gera-faturas", null);
		
		List<JobInstance> jobInstances = jobOperator.getJobInstances("gera-faturas", 0, 100000);
		
		for (JobInstance jobInstance : jobInstances) {
			List<JobExecution> jobExecutions = jobOperator.getJobExecutions(jobInstance);
			for (JobExecution jobExecution : jobExecutions) {
				resp.getWriter().println("Geração das faturas de execução #"
										+ jobExecution.getExecutionId()
										+ " com status:"
										+ jobExecution.getBatchStatus());
			}
		}
	}
	
	
}

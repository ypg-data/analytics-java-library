package com.adobe.analytics.client.methods;

import static com.adobe.analytics.client.JsonUtil.a;
import static com.adobe.analytics.client.JsonUtil.o;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

import com.adobe.analytics.client.AnalyticsClient;
import com.adobe.analytics.client.domain.CompanyReportSuites;
import com.adobe.analytics.client.domain.ReportSuiteEvars;
import com.adobe.analytics.client.domain.ReportSuiteProps;
import com.google.gson.reflect.TypeToken;

public class ReportSuiteMethods {

	private final AnalyticsClient client;

	public ReportSuiteMethods(AnalyticsClient client) {
		this.client = client;
	}

	public CompanyReportSuites getReportSuites() throws IOException {
		return client.callMethod("Company.GetReportSuites", o("types", a("standard")), CompanyReportSuites.class);
	}

	public List<ReportSuiteEvars> getEvars(String... rsid) throws IOException {
		final Type type = new TypeToken<List<ReportSuiteEvars>>() {}.getType();
		return client.callMethod("ReportSuite.GetEvars", o("rsid_list", rsid), type);
	}

	public List<ReportSuiteProps> getProps(String... rsid) throws IOException {
		final Type type = new TypeToken<List<ReportSuiteProps>>() {}.getType();
		return client.callMethod("ReportSuite.GetProps", o("rsid_list", rsid), type);
	}
}

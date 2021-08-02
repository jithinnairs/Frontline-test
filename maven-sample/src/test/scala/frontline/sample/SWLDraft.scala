
package SWLLoadTest


import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._


class SWLDraft extends Simulation {

	

object Chain_0 {

	val chain_0 = exec(http("Landing_Page")
			.get("/")
			 .check(regex("<input type=\"text\" name=\"(.+?)\" class=\"userid\"").saveAs("username"))
	        .check(regex("<input type=\"password\" name=\"(.+?)\" class=\"userid\"").saveAs("password"))
            .check(regex("<input type=\"hidden\" name=\"form\" value=\"(.+?)\"/>").saveAs("form"))
			//.headers(headers_0)
		)
		.pause(2)
		.exec(http("Login")
			.post("/?action=login")
			//.headers(headers_1)
			.formParam("form", "${form}")
			.formParam("clientrectwidth", "1536")
			.formParam("clientrectheight", "462")
			.formParam("${username}", "jithin@softwaretestinglessons.org")
			.formParam("${password}", "Testing!23")
			.formParam("submit", "Log In")
		    .check(regex("<h1>(.+?)</h1>").is("Welcome to PROFILER")))
		.pause(2)

		.exec(http("Workload")
			.get("/?page=wkwt_edit")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Save_Weekly_Timeslots")
			.post("/?page=wkwt_edit")
			//.headers(headers_1)
			.formParam("start1_7_1", " 1:00")
			.formParam("end1_7_1", " 2:00")
			.formParam("start1_7_2", "")
			.formParam("end1_7_2", "")
			.formParam("start1_1_1", "12")
			.formParam("end1_1_1", "14")
			.formParam("start1_1_2", "")
			.formParam("end1_1_2", "")
			.formParam("start1_2_1", "1")
			.formParam("end1_2_1", "4")
			.formParam("start1_2_2", "")
			.formParam("end1_2_2", "")
			.formParam("start1_3_1", "5")
			.formParam("end1_3_1", "6")
			.formParam("start1_3_2", "")
			.formParam("end1_3_2", "")
			.formParam("start1_4_1", "1")
			.formParam("end1_4_1", "5")
			.formParam("start1_4_2", "")
			.formParam("end1_4_2", "")
			.formParam("start1_5_1", "12")
			.formParam("end1_5_1", "16")
			.formParam("start1_5_2", "")
			.formParam("end1_5_2", "")
			.formParam("start1_6_1", "")
			.formParam("end1_6_1", "")
			.formParam("start1_6_2", "")
			.formParam("end1_6_2", "")
			.formParam("start2_7_1", "")
			.formParam("end2_7_1", "")
			.formParam("start2_7_2", "")
			.formParam("end2_7_2", "")
			.formParam("start2_1_1", "")
			.formParam("end2_1_1", "")
			.formParam("start2_1_2", "")
			.formParam("end2_1_2", "")
			.formParam("start2_2_1", "")
			.formParam("end2_2_1", "")
			.formParam("start2_2_2", "")
			.formParam("end2_2_2", "")
			.formParam("start2_3_1", "")
			.formParam("end2_3_1", "")
			.formParam("start2_3_2", "")
			.formParam("end2_3_2", "")
			.formParam("start2_4_1", "")
			.formParam("end2_4_1", "")
			.formParam("start2_4_2", "")
			.formParam("end2_4_2", "")
			.formParam("start2_5_1", "")
			.formParam("end2_5_1", "")
			.formParam("start2_5_2", "")
			.formParam("end2_5_2", "")
			.formParam("start2_6_1", "")
			.formParam("end2_6_1", "")
			.formParam("start2_6_2", "")
			.formParam("end2_6_2", "")
			.formParam("start3_7_1", "")
			.formParam("end3_7_1", "")
			.formParam("start3_7_2", "")
			.formParam("end3_7_2", "")
			.formParam("start3_7_3", "")
			.formParam("end3_7_3", "")
			.formParam("start3_1_1", "")
			.formParam("end3_1_1", "")
			.formParam("start3_1_2", "")
			.formParam("end3_1_2", "")
			.formParam("start3_1_3", "")
			.formParam("end3_1_3", "")
			.formParam("start3_2_1", "")
			.formParam("end3_2_1", "")
			.formParam("start3_2_2", "")
			.formParam("end3_2_2", "")
			.formParam("start3_2_3", "")
			.formParam("end3_2_3", "")
			.formParam("start3_3_1", "")
			.formParam("end3_3_1", "")
			.formParam("start3_3_2", "")
			.formParam("end3_3_2", "")
			.formParam("start3_3_3", "")
			.formParam("end3_3_3", "")
			.formParam("start3_4_1", "")
			.formParam("end3_4_1", "")
			.formParam("start3_4_2", "")
			.formParam("end3_4_2", "")
			.formParam("start3_4_3", "")
			.formParam("end3_4_3", "")
			.formParam("start3_5_1", "")
			.formParam("end3_5_1", "")
			.formParam("start3_5_2", "")
			.formParam("end3_5_2", "")
			.formParam("start3_5_3", "")
			.formParam("end3_5_3", "")
			.formParam("start3_6_1", "")
			.formParam("end3_6_1", "")
			.formParam("start3_6_2", "")
			.formParam("end3_6_2", "")
			.formParam("start3_6_3", "")
			.formParam("end3_6_3", "")
			.formParam("start4_7_1", "")
			.formParam("end4_7_1", "")
			.formParam("start4_7_2", "")
			.formParam("end4_7_2", "")
			.formParam("start4_7_3", "")
			.formParam("end4_7_3", "")
			.formParam("start4_1_1", "")
			.formParam("end4_1_1", "")
			.formParam("start4_1_2", "")
			.formParam("end4_1_2", "")
			.formParam("start4_1_3", "")
			.formParam("end4_1_3", "")
			.formParam("start4_2_1", "")
			.formParam("end4_2_1", "")
			.formParam("start4_2_2", "")
			.formParam("end4_2_2", "")
			.formParam("start4_2_3", "")
			.formParam("end4_2_3", "")
			.formParam("start4_3_1", "")
			.formParam("end4_3_1", "")
			.formParam("start4_3_2", "")
			.formParam("end4_3_2", "")
			.formParam("start4_3_3", "")
			.formParam("end4_3_3", "")
			.formParam("start4_4_1", "")
			.formParam("end4_4_1", "")
			.formParam("start4_4_2", "")
			.formParam("end4_4_2", "")
			.formParam("start4_4_3", "")
			.formParam("end4_4_3", "")
			.formParam("start4_5_1", "")
			.formParam("end4_5_1", "")
			.formParam("start4_5_2", "")
			.formParam("end4_5_2", "")
			.formParam("start4_5_3", "")
			.formParam("end4_5_3", "")
			.formParam("start4_6_1", "")
			.formParam("end4_6_1", "")
			.formParam("start4_6_2", "")
			.formParam("end4_6_2", "")
			.formParam("start4_6_3", "")
			.formParam("end4_6_3", "")
			.formParam("save", "save"))
		.pause(3)
		.exec(http("Forecast_Store")
			.get("/?page=forecastStore")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Submit_Forecast_Store")
			.post("/")
			//.headers(headers_1)
			.formParam("form", "workset_forecast")
			.formParam("displayMode", "All")
			.formParam("worksetType", "2")
			.formParam("formerror", "0")
			.formParam("forecastID", "0")
			.formParam("fi0", "5063.07")
			.formParam("fi7", "694.05")
			.formParam("fi1", "694.05")
			.formParam("fi2", "694.05")
			.formParam("fi3", "694.05")
			.formParam("fi4", "762.29")
			.formParam("fi5", "762.29")
			.formParam("fi6", "762.29")
			.formParam("pc0", "0.16")
			.formParam("pc7", "0")
			.formParam("pc1", "-8.53")
			.formParam("pc2", "6.43")
			.formParam("pc3", "15.57")
			.formParam("pc4", "17.54")
			.formParam("pc5", "0")
			.formParam("pc6", "-18.79")
			.formParam("submit", "submit"))
		.pause(3)
		.exec(http("Forecast_HubSpoke")
			.get("/?page=forecastHubSpoke")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Submit_Forecast_HubSpoke")
			.post("/")
			//.headers(headers_1)
			.formParam("form", "workset_forecast")
			.formParam("displayMode", "All")
			.formParam("worksetType", "2")
			.formParam("formerror", "0")
			.formParam("forecastID", "0")
			.formParam("fi0", "2299.5")
			.formParam("fi7", "328.5")
			.formParam("fi1", "328.5")
			.formParam("fi2", "328.5")
			.formParam("fi3", "328.5")
			.formParam("fi4", "328.5")
			.formParam("fi5", "328.5")
			.formParam("fi6", "328.5")
			.formParam("pc0", "29.99")
			.formParam("pc7", "35.25")
			.formParam("pc1", "23.71")
			.formParam("pc2", "43.95")
			.formParam("pc3", "56.31")
			.formParam("pc4", "44.74")
			.formParam("pc5", "23.14")
			.formParam("pc6", "0")
			.formParam("submit", "submit"))
		.pause(4)
		.exec(http("Current_Staff")
			.get("/?page=curstaff")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Edit_Absences")
			.get("/?action=absenceEdit&employeeID=145861&employmentID=1946286")
			//.headers(headers_2)
		)
		.pause(4)
		.exec(http("Add_Absence_Record")
			.post("/?action=absenceEdit&employeeID=145861")
			//.headers(headers_1)
			.formParam("form", "employee_absence")
			.formParam("employeeID", "145861")
			.formParam("display", "0")
			.formParam("editAction", "add"))
		.pause(3)
		.exec(http("Cancel_Absence_Record")
			.post("/?action=absenceEdit&employeeID=145861&editAction=absenceEdit&absenceID=")
			//.headers(headers_1)
			.formParam("form", "employee_absence_record")
			.formParam("absenceID", "")
			.formParam("display", "0")
			.formParam("absencecodeID", "7")
			.formParam("absencereasonID", "0")
			.formParam("startDate", "")
			.formParam("startTime", "")
			.formParam("endTime", ""))
		.pause(1)
		.exec(http("Save_Absence_Record")
			.post("/?action=absenceEdit&employeeID=145861&editAction=absenceEdit&absenceID=0")
			//.headers(headers_1)
			.formParam("form", "employee_absence_record")
			.formParam("absenceID", "0")
			.formParam("display", "0")
			.formParam("absencecodeID", "7")
			.formParam("absencereasonID", "0")
			.formParam("startDate", "01/08/2021")
			.formParam("allDay", "1")
			.formParam("endDate", "")
			.formParam("editAction", "save"))
		.pause(2)
		.exec(http("Click_Edit_Absence_Record")
			.get("/?editAction=absenceEdit&absenceID=6051419&action=absenceEdit&employeeID=145861&display=0")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Click_Edit_Save_Absence_Record")
			.post("/?action=absenceEdit&employeeID=145861&editAction=absenceEdit&absenceID=6051419")
			//.headers(headers_1)
			.formParam("form", "employee_absence_record")
			.formParam("absenceID", "6051419")
			.formParam("display", "0")
			.formParam("absencecodeID", "7")
			.formParam("absencereasonID", "0")
			.formParam("startDate", "26/07")
			.formParam("allDay", "1")
			.formParam("endDate", "29/07/2021")
			.formParam("editAction", "save"))
		.pause(2)
		.exec(http("Close_Create_Absence_Record")
			.post("/?action=absenceEdit&employeeID=145861")
			//.headers(headers_1)
			.formParam("form", "employee_absence")
			.formParam("employeeID", "145861")
			.formParam("display", "0")
			.formParam("cancel", "close"))
		.pause(2)
		.exec(http("Edit_Shift_Pattern")
			.get("/?action=rotationEdit&employeeID=144768&employmentID=1946622")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Save_Edit_Shift_Pattern")
			.post("/?action=rotationEdit&employmentID=1946622")
			//.headers(headers_1)
			.formParam("form", "rotation")
			.formParam("rotationID1", "2256028")
			.formParam("current_shiftID1", "-2")
			.formParam("current_departmentID1", "0")
			.formParam("shiftID1", "-2")
			.formParam("departmentID7_1", "0")
			.formParam("core1s7_1", "10")
			.formParam("core1e7_1", "5")
			.formParam("core2s7_1", "")
			.formParam("core2e7_1", "")
			.formParam("flex1s7_1", "")
			.formParam("flex1e7_1", "")
			.formParam("flex2s7_1", "")
			.formParam("flex2e7_1", "")
			.formParam("departmentID1_1", "0")
			.formParam("core1s1_1", "10")
			.formParam("core1e1_1", "5")
			.formParam("core2s1_1", "")
			.formParam("core2e1_1", "")
			.formParam("flex1s1_1", "")
			.formParam("flex1e1_1", "")
			.formParam("flex2s1_1", "")
			.formParam("flex2e1_1", "")
			.formParam("departmentID2_1", "0")
			.formParam("core1s2_1", "10")
			.formParam("core1e2_1", "5")
			.formParam("core2s2_1", "")
			.formParam("core2e2_1", "")
			.formParam("flex1s2_1", "")
			.formParam("flex1e2_1", "")
			.formParam("flex2s2_1", "")
			.formParam("flex2e2_1", "")
			.formParam("departmentID3_1", "0")
			.formParam("core1s3_1", "10")
			.formParam("core1e3_1", "5")
			.formParam("core2s3_1", "")
			.formParam("core2e3_1", "")
			.formParam("flex1s3_1", "")
			.formParam("flex1e3_1", "")
			.formParam("flex2s3_1", "")
			.formParam("flex2e3_1", "")
			.formParam("departmentID4_1", "0")
			.formParam("core1s4_1", "10")
			.formParam("core1e4_1", "5")
			.formParam("core2s4_1", "")
			.formParam("core2e4_1", "")
			.formParam("flex1s4_1", "")
			.formParam("flex1e4_1", "")
			.formParam("flex2s4_1", "")
			.formParam("flex2e4_1", "")
			.formParam("departmentID5_1", "0")
			.formParam("core1s5_1", "10")
			.formParam("core1e5_1", "5")
			.formParam("core2s5_1", "")
			.formParam("core2e5_1", "")
			.formParam("flex1s5_1", "")
			.formParam("flex1e5_1", "")
			.formParam("flex2s5_1", "")
			.formParam("flex2e5_1", "")
			.formParam("departmentID6_1", "0")
			.formParam("core1s6_1", "10")
			.formParam("core1e6_1", "5")
			.formParam("core2s6_1", "")
			.formParam("core2e6_1", "")
			.formParam("flex1s6_1", "")
			.formParam("flex1e6_1", "")
			.formParam("flex2s6_1", "")
			.formParam("flex2e6_1", "")
			.formParam("save", "save"))
		.pause(4)
		.exec(http("Update_Edit_Shift_Pattern")
			.post("/?action=rotationEdit&employmentID=1946622")
			//.headers(headers_1)
			.formParam("form", "rotation")
			.formParam("rotationID1", "2256028")
			.formParam("current_shiftID1", "-2")
			.formParam("current_departmentID1", "0")
			.formParam("shiftID1", "-2")
			.formParam("departmentID7_1", "0")
			.formParam("core1s7_1", "10:00")
			.formParam("core1e7_1", "5:00")
			.formParam("core2s7_1", "")
			.formParam("core2e7_1", "")
			.formParam("flex1s7_1", "")
			.formParam("flex1e7_1", "")
			.formParam("flex2s7_1", "")
			.formParam("flex2e7_1", "")
			.formParam("departmentID1_1", "0")
			.formParam("core1s1_1", "10:00")
			.formParam("core1e1_1", "5:00")
			.formParam("core2s1_1", "")
			.formParam("core2e1_1", "")
			.formParam("flex1s1_1", "")
			.formParam("flex1e1_1", "")
			.formParam("flex2s1_1", "")
			.formParam("flex2e1_1", "")
			.formParam("departmentID2_1", "0")
			.formParam("core1s2_1", "10:00")
			.formParam("core1e2_1", "5:00")
			.formParam("core2s2_1", "")
			.formParam("core2e2_1", "")
			.formParam("flex1s2_1", "")
			.formParam("flex1e2_1", "")
			.formParam("flex2s2_1", "")
			.formParam("flex2e2_1", "")
			.formParam("departmentID3_1", "0")
			.formParam("core1s3_1", "10:00")
			.formParam("core1e3_1", "5:00")
			.formParam("core2s3_1", "")
			.formParam("core2e3_1", "")
			.formParam("flex1s3_1", "")
			.formParam("flex1e3_1", "")
			.formParam("flex2s3_1", "")
			.formParam("flex2e3_1", "")
			.formParam("departmentID4_1", "0")
			.formParam("core1s4_1", "10:00")
			.formParam("core1e4_1", "5:00")
			.formParam("core2s4_1", "")
			.formParam("core2e4_1", "")
			.formParam("flex1s4_1", "")
			.formParam("flex1e4_1", "")
			.formParam("flex2s4_1", "")
			.formParam("flex2e4_1", "")
			.formParam("departmentID5_1", "0")
			.formParam("core1s5_1", "10:00")
			.formParam("core1e5_1", "5:00")
			.formParam("core2s5_1", "")
			.formParam("core2e5_1", "")
			.formParam("flex1s5_1", "")
			.formParam("flex1e5_1", "")
			.formParam("flex2s5_1", "")
			.formParam("flex2e5_1", "")
			.formParam("departmentID6_1", "0")
			.formParam("core1s6_1", "10:00")
			.formParam("core1e6_1", "5:00")
			.formParam("core2s6_1", "")
			.formParam("core2e6_1", "")
			.formParam("flex1s6_1", "")
			.formParam("flex1e6_1", "")
			.formParam("flex2s6_1", "")
			.formParam("flex2e6_1", "")
			.formParam("update", "update"))
		.pause(4)
		.exec(http("Edit_Employee")
			.get("/?action=employeeEdit&employeeID=133756&employmentID=1941808")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Save_Edit_Employee")
			.post("/")
			//.headers(headers_1)
			.formParam("action", "employeeEdit")
			.formParam("object", "employee")
			.formParam("employeeID", "133756")
			.formParam("defLunchBreak", "0")
			.formParam("employmentID", "1941808")
			.formParam("startDate", "02/05/2021")
			.formParam("endDate", "")
			.formParam("maximumHoursDay", "8")
			.formParam("maximumHoursWeek", "40")
			.formParam("maximumLateNights", "3")
			.formParam("save", "save"))
		.pause(2)
		.exec(http("Absence_Requests")
			.get("/?page=absencerequests")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Click_Approve_Absence_Request")
			.get("/?action=absenceapprove&absenceID=6027687")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Enter_notes_and_approve")
			.post("/?action=absenceapprove&absenceID=6027687")
			//.headers(headers_1)
			.formParam("responseNotes", "approved")
			.formParam("notify", "1")
			.formParam("confirm", "approve"))
		.pause(2)
		.exec(http("Profile")
			.get("/?page=profile")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Select_Management_Profile")
			.post("/")
			//.headers(headers_1)
			.formParam("groupingID", "30"))
		.pause(2)
	}

	object Chain_1 {

	val chain_1 =  exec(http("Update_Profile")
			.post("/?page=profile")
			//.headers(headers_1)
			.formParam("form", "profiler")
			.formParam("clientrectwidth", "1536")
			.formParam("clientrectheight", "462")
			.formParam("headerheight", "88")
			.formParam("footerheight", "20")
			.formParam("a9", "2")
			.formParam("a10", "")
			.formParam("a11", "2")
			.formParam("a12", "2")
			.formParam("a13", "")
			.formParam("a14", "")
			.formParam("a15", "")
			.formParam("a16", "")
			.formParam("a17", "")
			.formParam("a18", "")
			.formParam("e0ID", "61077")
			.formParam("e1ID", "13687")
			.formParam("e2ID", "39743")
			.formParam("e3ID", "13698")
			.formParam("e4ID", "14224")
			.formParam("e5ID", "52361")
			.formParam("e6ID", "15280")
			.formParam("d0_1", "41")
			.formParam("e0s1", "10:00")
			.formParam("e0f1", "13:00")
			.formParam("d0_2", "41")
			.formParam("e0s2", "15:00")
			.formParam("e0f2", "17:00")
			.formParam("d0_3", "41")
			.formParam("e0s3", "")
			.formParam("e0f3", "")
			.formParam("d0_4", "41")
			.formParam("e0s4", "")
			.formParam("e0f4", "")
			.formParam("d1_1", "41")
			.formParam("e1s1", "")
			.formParam("e1f1", "")
			.formParam("d1_2", "41")
			.formParam("e1s2", "")
			.formParam("e1f2", "")
			.formParam("d1_3", "41")
			.formParam("e1s3", "")
			.formParam("e1f3", "")
			.formParam("d1_4", "41")
			.formParam("e1s4", "")
			.formParam("e1f4", "")
			.formParam("d2_1", "41")
			.formParam("e2s1", "")
			.formParam("e2f1", "")
			.formParam("d2_2", "41")
			.formParam("e2s2", "")
			.formParam("e2f2", "")
			.formParam("d2_3", "41")
			.formParam("e2s3", "")
			.formParam("e2f3", "")
			.formParam("d2_4", "41")
			.formParam("e2s4", "")
			.formParam("e2f4", "")
			.formParam("d3_1", "41")
			.formParam("e3s1", "")
			.formParam("e3f1", "")
			.formParam("d3_2", "41")
			.formParam("e3s2", "")
			.formParam("e3f2", "")
			.formParam("d3_3", "41")
			.formParam("e3s3", "")
			.formParam("e3f3", "")
			.formParam("d3_4", "41")
			.formParam("e3s4", "")
			.formParam("e3f4", "")
			.formParam("d4_1", "41")
			.formParam("e4s1", "")
			.formParam("e4f1", "")
			.formParam("d4_2", "41")
			.formParam("e4s2", "")
			.formParam("e4f2", "")
			.formParam("d4_3", "41")
			.formParam("e4s3", "")
			.formParam("e4f3", "")
			.formParam("d4_4", "41")
			.formParam("e4s4", "")
			.formParam("e4f4", "")
			.formParam("d5_1", "41")
			.formParam("e5s1", "")
			.formParam("e5f1", "")
			.formParam("d5_2", "41")
			.formParam("e5s2", "")
			.formParam("e5f2", "")
			.formParam("d5_3", "41")
			.formParam("e5s3", "")
			.formParam("e5f3", "")
			.formParam("d5_4", "41")
			.formParam("e5s4", "")
			.formParam("e5f4", "")
			.formParam("d6_1", "41")
			.formParam("e6s1", "")
			.formParam("e6f1", "")
			.formParam("d6_2", "41")
			.formParam("e6s2", "")
			.formParam("e6f2", "")
			.formParam("d6_3", "41")
			.formParam("e6s3", "")
			.formParam("e6f3", "")
			.formParam("d6_4", "41")
			.formParam("e6s4", "")
			.formParam("e6f4", "")
			.formParam("update", "update"))
		.pause(5)
		.exec(http("Select_day_Profile")
			.post("/")
			//.headers(headers_1)
			.formParam("day", "3"))
		.pause(2)
		.exec(http("Update_Profile")
			.post("/?page=profile")
			//.headers(headers_1)
			.formParam("form", "profiler")
			.formParam("clientrectwidth", "1536")
			.formParam("clientrectheight", "462")
			.formParam("headerheight", "88")
			.formParam("footerheight", "20")
			.formParam("a9", "")
			.formParam("a10", "")
			.formParam("a11", "")
			.formParam("a12", "")
			.formParam("a13", "")
			.formParam("a14", "")
			.formParam("a15", "")
			.formParam("a16", "")
			.formParam("a17", "")
			.formParam("a18", "")
			.formParam("a19", "")
			.formParam("e0ID", "61077")
			.formParam("e1ID", "13687")
			.formParam("e2ID", "39743")
			.formParam("e3ID", "13698")
			.formParam("e4ID", "14224")
			.formParam("e5ID", "52361")
			.formParam("e6ID", "15280")
			.formParam("d0_1", "41")
			.formParam("e0s1", "")
			.formParam("e0f1", "")
			.formParam("d0_2", "41")
			.formParam("e0s2", "")
			.formParam("e0f2", "")
			.formParam("d0_3", "41")
			.formParam("e0s3", "")
			.formParam("e0f3", "")
			.formParam("d0_4", "41")
			.formParam("e0s4", "")
			.formParam("e0f4", "")
			.formParam("d1_1", "41")
			.formParam("e1s1", "10:00")
			.formParam("e1f1", "12:00")
			.formParam("d1_2", "41")
			.formParam("e1s2", "13:00")
			.formParam("e1f2", "17:00")
			.formParam("d1_3", "41")
			.formParam("e1s3", "")
			.formParam("e1f3", "")
			.formParam("d1_4", "41")
			.formParam("e1s4", "")
			.formParam("e1f4", "")
			.formParam("d2_1", "41")
			.formParam("e2s1", "")
			.formParam("e2f1", "")
			.formParam("d2_2", "41")
			.formParam("e2s2", "")
			.formParam("e2f2", "")
			.formParam("d2_3", "41")
			.formParam("e2s3", "")
			.formParam("e2f3", "")
			.formParam("d2_4", "41")
			.formParam("e2s4", "")
			.formParam("e2f4", "")
			.formParam("d3_1", "41")
			.formParam("e3s1", "")
			.formParam("e3f1", "")
			.formParam("d3_2", "41")
			.formParam("e3s2", "")
			.formParam("e3f2", "")
			.formParam("d3_3", "41")
			.formParam("e3s3", "")
			.formParam("e3f3", "")
			.formParam("d3_4", "41")
			.formParam("e3s4", "")
			.formParam("e3f4", "")
			.formParam("d4_1", "41")
			.formParam("e4s1", "")
			.formParam("e4f1", "")
			.formParam("d4_2", "41")
			.formParam("e4s2", "")
			.formParam("e4f2", "")
			.formParam("d4_3", "41")
			.formParam("e4s3", "")
			.formParam("e4f3", "")
			.formParam("d4_4", "41")
			.formParam("e4s4", "")
			.formParam("e4f4", "")
			.formParam("d5_1", "41")
			.formParam("e5s1", "")
			.formParam("e5f1", "")
			.formParam("d5_2", "41")
			.formParam("e5s2", "")
			.formParam("e5f2", "")
			.formParam("d5_3", "41")
			.formParam("e5s3", "")
			.formParam("e5f3", "")
			.formParam("d5_4", "41")
			.formParam("e5s4", "")
			.formParam("e5f4", "")
			.formParam("d6_1", "41")
			.formParam("e6s1", "")
			.formParam("e6f1", "")
			.formParam("d6_2", "41")
			.formParam("e6s2", "")
			.formParam("e6f2", "")
			.formParam("d6_3", "41")
			.formParam("e6s3", "")
			.formParam("e6f3", "")
			.formParam("d6_4", "41")
			.formParam("e6s4", "")
			.formParam("e6f4", "")
			.formParam("update", "update"))
		.pause(5)
		.exec(http("Click_Publish")
			.post("/?action=publishToolbarAction")
			//.headers(headers_1)
			.formParam("publishToolbarAction", "publish"))
		.pause(3)
		.exec(http("Post_Publish_Assignments")
			.post("/?action=publishToolbarAction&publishToolbarAction=publish")
			//.headers(headers_1)
			.formParam("notify61077", "1")
			.formParam("notify13687", "1")
			.formParam("publish", "publish"))
		.pause(5)
		.exec(http("TandA")
			.get("/?page=tnareviewDay")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("update_TandA")
			.post("/")
			//.headers(headers_1)
			.formParam("clientrectwidth", "1536")
			.formParam("clientrectheight", "462")
			.formParam("headerheight", "126")
			.formParam("footerheight", "20")
			.formParam("employeeID0", "13687")
			.formParam("reviewID0", "89631700")
			.formParam("cke_89631700_in1", "10:00")
			.formParam("cko_89631700_in1", "")
			.formParam("ckc_89631700_in1", "manual")
			.formParam("cke_89631700_out1", "12:00")
			.formParam("cko_89631700_out1", "")
			.formParam("ckc_89631700_out1", "manual")
			.formParam("cke_89631700_in2", "13:00")
			.formParam("cko_89631700_in2", "")
			.formParam("ckc_89631700_in2", "manual")
			.formParam("cke_89631700_out2", "17:00")
			.formParam("cko_89631700_out2", "")
			.formParam("ckc_89631700_out2", "manual")
			.formParam("payrolltype13_89631700", "")
			.formParam("payrolltype6_89631700", "")
			.formParam("payrolltype7_89631700", "")
			.formParam("payrolltype8_89631700", "")
			.formParam("payrolltype9_89631700", "")
			.formParam("payrolltype23_89631700", "")
			.formParam("authoriseComment89631700", "")
			.formParam("form", "tna_review")
			.formParam("reviewtype", "1")
			.formParam("submit", "update"))
		.pause(2)
		.exec(http("Summary_TandA")
			.get("/?page=tnareviewWeek")
		//	.headers(headers_2)
		)
		.pause(2)
		.exec(http("Edit_Employee_TandA")
		.get("/?page=tnaemployeereviewWeek&employeeID=52361&reviewID=89631438")

	     //.headers(headers_2)
		)
		.pause(2)
		.exec(http("Post_Edit_Employee_TandA")
			.post("/?employeeID=52361")
			//.headers(headers_1)
			.formParam("clientrectwidth", "1536")
			.formParam("clientrectheight", "462")
			.formParam("headerheight", "126")
			.formParam("footerheight", "20")
			.formParam("reviewID0", "89631516")
			.formParam("reviewID1", "89631594")
			.formParam("reviewID2", "89631672")
			.formParam("reviewID3", "89631750")
			.formParam("reviewID4", "89631828")
			.formParam("reviewID5", "89631906")
			.formParam("reviewID6", "89631984")
			.formParam("cke_89631516_in1", "")
			.formParam("cko_89631516_in1", "")
			.formParam("ckc_89631516_in1", "manual")
			.formParam("cke_89631516_out1", "")
			.formParam("cko_89631516_out1", "")
			.formParam("ckc_89631516_out1", "manual")
			.formParam("cke_89631516_in2", "")
			.formParam("cko_89631516_in2", "")
			.formParam("ckc_89631516_in2", "manual")
			.formParam("cke_89631516_out2", "")
			.formParam("cko_89631516_out2", "")
			.formParam("ckc_89631516_out2", "manual")
			.formParam("cke_89631516_in3", "")
			.formParam("cko_89631516_in3", "")
			.formParam("ckc_89631516_in3", "manual")
			.formParam("cke_89631516_out3", "")
			.formParam("cko_89631516_out3", "")
			.formParam("ckc_89631516_out3", "manual")
			.formParam("cke_89631516_in4", "")
			.formParam("cko_89631516_in4", "")
			.formParam("ckc_89631516_in4", "manual")
			.formParam("cke_89631516_out4", "")
			.formParam("cko_89631516_out4", "")
			.formParam("ckc_89631516_out4", "manual")
			.formParam("payrolltype13_89631516", "")
			.formParam("payrolltype6_89631516", "")
			.formParam("payrolltype7_89631516", "")
			.formParam("payrolltype8_89631516", "")
			.formParam("payrolltype9_89631516", "")
			.formParam("payrolltype23_89631516", "")
			.formParam("authoriseComment89631516", "")
			.formParam("cke_89631594_in1", "10:00")
			.formParam("cko_89631594_in1", "")
			.formParam("ckc_89631594_in1", "manual")
			.formParam("cke_89631594_out1", "12:00")
			.formParam("cko_89631594_out1", "")
			.formParam("ckc_89631594_out1", "manual")
			.formParam("cke_89631594_in2", "13:00")
			.formParam("cko_89631594_in2", "")
			.formParam("ckc_89631594_in2", "manual")
			.formParam("cke_89631594_out2", "17:00")
			.formParam("cko_89631594_out2", "")
			.formParam("ckc_89631594_out2", "manual")
			.formParam("cke_89631594_in3", "10:00")
			.formParam("cko_89631594_in3", "")
			.formParam("ckc_89631594_in3", "manual")
			.formParam("cke_89631594_out3", "13:00")
			.formParam("cko_89631594_out3", "")
			.formParam("ckc_89631594_out3", "manual")
			.formParam("cke_89631594_in4", "15:00")
			.formParam("cko_89631594_in4", "")
			.formParam("ckc_89631594_in4", "manual")
			.formParam("cke_89631594_out4", "19:00")
			.formParam("cko_89631594_out4", "")
			.formParam("ckc_89631594_out4", "manual")
			.formParam("payrolltype13_89631594", "")
			.formParam("payrolltype6_89631594", "")
			.formParam("payrolltype7_89631594", "")
			.formParam("payrolltype8_89631594", "")
			.formParam("payrolltype9_89631594", "")
			.formParam("payrolltype23_89631594", "")
			.formParam("authoriseComment89631594", "")
			.formParam("cke_89631672_in1", "")
			.formParam("cko_89631672_in1", "")
			.formParam("ckc_89631672_in1", "manual")
			.formParam("cke_89631672_out1", "")
			.formParam("cko_89631672_out1", "")
			.formParam("ckc_89631672_out1", "manual")
			.formParam("cke_89631672_in2", "")
			.formParam("cko_89631672_in2", "")
			.formParam("ckc_89631672_in2", "manual")
			.formParam("cke_89631672_out2", "")
			.formParam("cko_89631672_out2", "")
			.formParam("ckc_89631672_out2", "manual")
			.formParam("cke_89631672_in3", "")
			.formParam("cko_89631672_in3", "")
			.formParam("ckc_89631672_in3", "manual")
			.formParam("cke_89631672_out3", "")
			.formParam("cko_89631672_out3", "")
			.formParam("ckc_89631672_out3", "manual")
			.formParam("cke_89631672_in4", "")
			.formParam("cko_89631672_in4", "")
			.formParam("ckc_89631672_in4", "manual")
			.formParam("cke_89631672_out4", "")
			.formParam("cko_89631672_out4", "")
			.formParam("ckc_89631672_out4", "manual")
			.formParam("payrolltype13_89631672", "")
			.formParam("payrolltype6_89631672", "")
			.formParam("payrolltype7_89631672", "")
			.formParam("payrolltype8_89631672", "")
			.formParam("payrolltype9_89631672", "")
			.formParam("payrolltype23_89631672", "")
			.formParam("authoriseComment89631672", "")
			.formParam("cke_89631750_in1", "")
			.formParam("cko_89631750_in1", "")
			.formParam("ckc_89631750_in1", "manual")
			.formParam("cke_89631750_out1", "")
			.formParam("cko_89631750_out1", "")
			.formParam("ckc_89631750_out1", "manual")
			.formParam("cke_89631750_in2", "")
			.formParam("cko_89631750_in2", "")
			.formParam("ckc_89631750_in2", "manual")
			.formParam("cke_89631750_out2", "")
			.formParam("cko_89631750_out2", "")
			.formParam("ckc_89631750_out2", "manual")
			.formParam("cke_89631750_in3", "")
			.formParam("cko_89631750_in3", "")
			.formParam("ckc_89631750_in3", "manual")
			.formParam("cke_89631750_out3", "")
			.formParam("cko_89631750_out3", "")
			.formParam("ckc_89631750_out3", "manual")
			.formParam("cke_89631750_in4", "")
			.formParam("cko_89631750_in4", "")
			.formParam("ckc_89631750_in4", "manual")
			.formParam("cke_89631750_out4", "")
			.formParam("cko_89631750_out4", "")
			.formParam("ckc_89631750_out4", "manual")
			.formParam("payrolltype13_89631750", "")
			.formParam("payrolltype6_89631750", "")
			.formParam("payrolltype7_89631750", "")
			.formParam("payrolltype8_89631750", "")
			.formParam("payrolltype9_89631750", "")
			.formParam("payrolltype23_89631750", "")
			.formParam("authoriseComment89631750", "")
			.formParam("cke_89631828_in1", "")
			.formParam("cko_89631828_in1", "")
			.formParam("ckc_89631828_in1", "manual")
			.formParam("cke_89631828_out1", "")
			.formParam("cko_89631828_out1", "")
			.formParam("ckc_89631828_out1", "manual")
			.formParam("cke_89631828_in2", "")
			.formParam("cko_89631828_in2", "")
			.formParam("ckc_89631828_in2", "manual")
			.formParam("cke_89631828_out2", "")
			.formParam("cko_89631828_out2", "")
			.formParam("ckc_89631828_out2", "manual")
			.formParam("cke_89631828_in3", "")
			.formParam("cko_89631828_in3", "")
			.formParam("ckc_89631828_in3", "manual")
			.formParam("cke_89631828_out3", "")
			.formParam("cko_89631828_out3", "")
			.formParam("ckc_89631828_out3", "manual")
			.formParam("cke_89631828_in4", "")
			.formParam("cko_89631828_in4", "")
			.formParam("ckc_89631828_in4", "manual")
			.formParam("cke_89631828_out4", "")
			.formParam("cko_89631828_out4", "")
			.formParam("ckc_89631828_out4", "manual")
			.formParam("payrolltype13_89631828", "")
			.formParam("payrolltype6_89631828", "")
			.formParam("payrolltype7_89631828", "")
			.formParam("payrolltype8_89631828", "")
			.formParam("payrolltype9_89631828", "")
			.formParam("payrolltype23_89631828", "")
			.formParam("authoriseComment89631828", "")
			.formParam("cke_89631906_in1", "")
			.formParam("cko_89631906_in1", "")
			.formParam("ckc_89631906_in1", "manual")
			.formParam("cke_89631906_out1", "")
			.formParam("cko_89631906_out1", "")
			.formParam("ckc_89631906_out1", "manual")
			.formParam("cke_89631906_in2", "")
			.formParam("cko_89631906_in2", "")
			.formParam("ckc_89631906_in2", "manual")
			.formParam("cke_89631906_out2", "")
			.formParam("cko_89631906_out2", "")
			.formParam("ckc_89631906_out2", "manual")
			.formParam("cke_89631906_in3", "")
			.formParam("cko_89631906_in3", "")
			.formParam("ckc_89631906_in3", "manual")
			.formParam("cke_89631906_out3", "")
			.formParam("cko_89631906_out3", "")
			.formParam("ckc_89631906_out3", "manual")
			.formParam("cke_89631906_in4", "")
			.formParam("cko_89631906_in4", "")
			.formParam("ckc_89631906_in4", "manual")
			.formParam("cke_89631906_out4", "")
			.formParam("cko_89631906_out4", "")
			.formParam("ckc_89631906_out4", "manual")
			.formParam("payrolltype13_89631906", "")
			.formParam("payrolltype6_89631906", "")
			.formParam("payrolltype7_89631906", "")
			.formParam("payrolltype8_89631906", "")
			.formParam("payrolltype9_89631906", "")
			.formParam("payrolltype23_89631906", "")
			.formParam("authoriseComment89631906", "")
			.formParam("cke_89631984_in1", "")
			.formParam("cko_89631984_in1", "")
			.formParam("ckc_89631984_in1", "manual")
			.formParam("cke_89631984_out1", "")
			.formParam("cko_89631984_out1", "")
			.formParam("ckc_89631984_out1", "manual")
			.formParam("cke_89631984_in2", "")
			.formParam("cko_89631984_in2", "")
			.formParam("ckc_89631984_in2", "manual")
			.formParam("cke_89631984_out2", "")
			.formParam("cko_89631984_out2", "")
			.formParam("ckc_89631984_out2", "manual")
			.formParam("cke_89631984_in3", "")
			.formParam("cko_89631984_in3", "")
			.formParam("ckc_89631984_in3", "manual")
			.formParam("cke_89631984_out3", "")
			.formParam("cko_89631984_out3", "")
			.formParam("ckc_89631984_out3", "manual")
			.formParam("cke_89631984_in4", "")
			.formParam("cko_89631984_in4", "")
			.formParam("ckc_89631984_in4", "manual")
			.formParam("cke_89631984_out4", "")
			.formParam("cko_89631984_out4", "")
			.formParam("ckc_89631984_out4", "manual")
			.formParam("payrolltype13_89631984", "")
			.formParam("payrolltype6_89631984", "")
			.formParam("payrolltype7_89631984", "")
			.formParam("payrolltype8_89631984", "")
			.formParam("payrolltype9_89631984", "")
			.formParam("payrolltype23_89631984", "")
			.formParam("authoriseComment89631984", "")
			.formParam("form", "tna_review")
			.formParam("reviewtype", "2")
			.formParam("submit", "update"))
		.pause(7)
		.exec(http("clockings_List")
			.get("/?page=clockingsList")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Driver_hours")
			.get("/?page=argosmpt_dhpage")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Post_Driver_hours")
			.post("/?page=argosmpt_dhpage")
			//.headers(headers_1)
			.formParam("form", "driverhours")
			.formParam("cko_x_s", "")
			.formParam("ckc_x_s", "upload")
			.formParam("cke_x_s", "10:00")
			.formParam("cko_x_e", "")
			.formParam("ckc_x_e", "upload")
			.formParam("cke_x_e", "15:00")
			.formParam("employeeID_x", "144768")
			.formParam("update", "update"))
		.pause(2)
		.exec(http("Employee_Times")
			.get("/?page=employeetimes")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Daily_Chart")
			.get("/?page=dailychart")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Weekly_Chart")
			.get("/?page=weeklychart")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Line_Rota")
			.get("/?page=linerota")
			//.headers(headers_2)
		)
		.pause(2)

            .exec(http("Staff_Search")
			.get("/?page=reportStaff")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Absence_Report")
			.get("/?page=absence_report")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Select_Employee_Absence_Report")
			.post("/?page=absence_report")
			//.headers(headers_1)
			.formParam("employeeID", "145861"))
		.pause(2)
		.exec(http("Payroll_Release")
			.get("/?page=argosmpt_releasereport")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Post_Payroll_Release")
			.post("/?page=argosmpt_releasereport")
			//.headers(headers_1)
			.formParam("show", "1"))
		.pause(3)
		.exec(http("Hours")
			.get("/?page=argrephrs")
			//.headers(headers_2)
		)
		.pause(2)
		.exec(http("Logout")
			.get("/?action=logout")
			//.headers(headers_2)
		)

			}

		val httpProtocol = http
		.baseUrl("https://demo.swlgroup.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-GB,en-US;q=0.9,en;q=0.8,ml-IN;q=0.7,ml;q=0.6")
		.upgradeInsecureRequestsHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.107 Safari/537.36")
/*
	val headers_0 = Map(
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "none",
		"Sec-Fetch-User" -> "?1",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_1 = Map(
		"Cache-Control" -> "max-age=0",
		"Origin" -> "null",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

	val headers_2 = Map(
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
		"sec-ch-ua-mobile" -> "?0")

*/

	val scn = scenario("SWLDraft").exec(Chain_0.chain_0, Chain_1.chain_1)


	//setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)

	 setUp(scn.inject(rampUsers(500) during(100.seconds)).protocols(httpProtocol))

}

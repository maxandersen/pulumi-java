// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.ApmSynthetics;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.ApmSynthetics.inputs.GetMonitorArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetMonitorsArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetResultArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetScriptArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetScriptsArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetVantagePointArgs;
import com.pulumi.oci.ApmSynthetics.inputs.GetVantagePointsArgs;
import com.pulumi.oci.ApmSynthetics.outputs.GetMonitorResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetMonitorsResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetResultResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetScriptResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetScriptsResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetVantagePointResult;
import com.pulumi.oci.ApmSynthetics.outputs.GetVantagePointsResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class ApmSyntheticsFunctions {
    /**
     * This data source provides details about a specific Monitor resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the configuration of the monitor identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMonitorResult> getMonitor(GetMonitorArgs args) {
        return getMonitor(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Monitor resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the configuration of the monitor identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMonitorResult> getMonitor(GetMonitorArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getMonitor:getMonitor", TypeShape.of(GetMonitorResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Monitors in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of monitors.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMonitorsResult> getMonitors(GetMonitorsArgs args) {
        return getMonitors(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Monitors in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of monitors.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetMonitorsResult> getMonitors(GetMonitorsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getMonitors:getMonitors", TypeShape.of(GetMonitorsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Result resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the results for a specific execution of a monitor identified by OCID. The results are in a HAR file, Screenshot, Console Log or Network details.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetResultResult> getResult(GetResultArgs args) {
        return getResult(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Result resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the results for a specific execution of a monitor identified by OCID. The results are in a HAR file, Screenshot, Console Log or Network details.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetResultResult> getResult(GetResultArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getResult:getResult", TypeShape.of(GetResultResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Script resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the configuration of the script identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args) {
        return getScript(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Script resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Gets the configuration of the script identified by the OCID.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetScriptResult> getScript(GetScriptArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getScript:getScript", TypeShape.of(GetScriptResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Scripts in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of scripts.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetScriptsResult> getScripts(GetScriptsArgs args) {
        return getScripts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Scripts in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of scripts.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetScriptsResult> getScripts(GetScriptsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getScripts:getScripts", TypeShape.of(GetScriptsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Public Vantage Point resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of public vantage points.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVantagePointResult> getVantagePoint(GetVantagePointArgs args) {
        return getVantagePoint(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Public Vantage Point resource in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of public vantage points.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVantagePointResult> getVantagePoint(GetVantagePointArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getVantagePoint:getVantagePoint", TypeShape.of(GetVantagePointResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Public Vantage Points in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of public vantage points.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVantagePointsResult> getVantagePoints(GetVantagePointsArgs args) {
        return getVantagePoints(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Public Vantage Points in Oracle Cloud Infrastructure Apm Synthetics service.
     * 
     * Returns a list of public vantage points.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetVantagePointsResult> getVantagePoints(GetVantagePointsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:ApmSynthetics/getVantagePoints:getVantagePoints", TypeShape.of(GetVantagePointsResult.class), args, Utilities.withVersion(options));
    }
}

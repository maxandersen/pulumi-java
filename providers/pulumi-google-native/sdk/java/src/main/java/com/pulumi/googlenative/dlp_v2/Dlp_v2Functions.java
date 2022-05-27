// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dlp_v2;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.dlp_v2.inputs.GetDeidentifyTemplateArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GetDlpJobArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GetInspectTemplateArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GetJobTriggerArgs;
import com.pulumi.googlenative.dlp_v2.inputs.GetStoredInfoTypeArgs;
import com.pulumi.googlenative.dlp_v2.outputs.GetDeidentifyTemplateResult;
import com.pulumi.googlenative.dlp_v2.outputs.GetDlpJobResult;
import com.pulumi.googlenative.dlp_v2.outputs.GetInspectTemplateResult;
import com.pulumi.googlenative.dlp_v2.outputs.GetJobTriggerResult;
import com.pulumi.googlenative.dlp_v2.outputs.GetStoredInfoTypeResult;
import java.util.concurrent.CompletableFuture;

public final class Dlp_v2Functions {
    /**
     * Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
     * 
     */
    public static CompletableFuture<GetDeidentifyTemplateResult> getDeidentifyTemplate(GetDeidentifyTemplateArgs args) {
        return getDeidentifyTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Gets a DeidentifyTemplate. See https://cloud.google.com/dlp/docs/creating-templates-deid to learn more.
     * 
     */
    public static CompletableFuture<GetDeidentifyTemplateResult> getDeidentifyTemplate(GetDeidentifyTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getDeidentifyTemplate", TypeShape.of(GetDeidentifyTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets the latest state of a long-running DlpJob. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
     * 
     */
    public static CompletableFuture<GetDlpJobResult> getDlpJob(GetDlpJobArgs args) {
        return getDlpJob(args, InvokeOptions.Empty);
    }
    /**
     * Gets the latest state of a long-running DlpJob. See https://cloud.google.com/dlp/docs/inspecting-storage and https://cloud.google.com/dlp/docs/compute-risk-analysis to learn more.
     * 
     */
    public static CompletableFuture<GetDlpJobResult> getDlpJob(GetDlpJobArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getDlpJob", TypeShape.of(GetDlpJobResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
     * 
     */
    public static CompletableFuture<GetInspectTemplateResult> getInspectTemplate(GetInspectTemplateArgs args) {
        return getInspectTemplate(args, InvokeOptions.Empty);
    }
    /**
     * Gets an InspectTemplate. See https://cloud.google.com/dlp/docs/creating-templates to learn more.
     * 
     */
    public static CompletableFuture<GetInspectTemplateResult> getInspectTemplate(GetInspectTemplateArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getInspectTemplate", TypeShape.of(GetInspectTemplateResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
     * 
     */
    public static CompletableFuture<GetJobTriggerResult> getJobTrigger(GetJobTriggerArgs args) {
        return getJobTrigger(args, InvokeOptions.Empty);
    }
    /**
     * Gets a job trigger. See https://cloud.google.com/dlp/docs/creating-job-triggers to learn more.
     * 
     */
    public static CompletableFuture<GetJobTriggerResult> getJobTrigger(GetJobTriggerArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getJobTrigger", TypeShape.of(GetJobTriggerResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
     * 
     */
    public static CompletableFuture<GetStoredInfoTypeResult> getStoredInfoType(GetStoredInfoTypeArgs args) {
        return getStoredInfoType(args, InvokeOptions.Empty);
    }
    /**
     * Gets a stored infoType. See https://cloud.google.com/dlp/docs/creating-stored-infotypes to learn more.
     * 
     */
    public static CompletableFuture<GetStoredInfoTypeResult> getStoredInfoType(GetStoredInfoTypeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("google-native:dlp/v2:getStoredInfoType", TypeShape.of(GetStoredInfoTypeResult.class), args, Utilities.withVersion(options));
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Limits;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.oci.Limits.inputs.GetLimitDefinitionsArgs;
import com.pulumi.oci.Limits.inputs.GetLimitValuesArgs;
import com.pulumi.oci.Limits.inputs.GetQuotaArgs;
import com.pulumi.oci.Limits.inputs.GetQuotasArgs;
import com.pulumi.oci.Limits.inputs.GetResourceAvailabilityArgs;
import com.pulumi.oci.Limits.inputs.GetServicesArgs;
import com.pulumi.oci.Limits.outputs.GetLimitDefinitionsResult;
import com.pulumi.oci.Limits.outputs.GetLimitValuesResult;
import com.pulumi.oci.Limits.outputs.GetQuotaResult;
import com.pulumi.oci.Limits.outputs.GetQuotasResult;
import com.pulumi.oci.Limits.outputs.GetResourceAvailabilityResult;
import com.pulumi.oci.Limits.outputs.GetServicesResult;
import com.pulumi.oci.Utilities;
import java.util.concurrent.CompletableFuture;

public final class LimitsFunctions {
    /**
     * This data source provides the list of Limit Definitions in Oracle Cloud Infrastructure Limits service.
     * 
     * Includes a list of resource limits that are currently supported.
     * If the &#39;areQuotasSupported&#39; property is true, you can create quota policies on top of this limit at the
     * compartment level.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLimitDefinitionsResult> getLimitDefinitions(GetLimitDefinitionsArgs args) {
        return getLimitDefinitions(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Limit Definitions in Oracle Cloud Infrastructure Limits service.
     * 
     * Includes a list of resource limits that are currently supported.
     * If the &#39;areQuotasSupported&#39; property is true, you can create quota policies on top of this limit at the
     * compartment level.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLimitDefinitionsResult> getLimitDefinitions(GetLimitDefinitionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getLimitDefinitions:getLimitDefinitions", TypeShape.of(GetLimitDefinitionsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Limit Values in Oracle Cloud Infrastructure Limits service.
     * 
     * Includes a full list of resource limits belonging to a given service.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLimitValuesResult> getLimitValues(GetLimitValuesArgs args) {
        return getLimitValues(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Limit Values in Oracle Cloud Infrastructure Limits service.
     * 
     * Includes a full list of resource limits belonging to a given service.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetLimitValuesResult> getLimitValues(GetLimitValuesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getLimitValues:getLimitValues", TypeShape.of(GetLimitValuesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Quota resource in Oracle Cloud Infrastructure Limits service.
     * 
     * Gets the quota for the OCID specified.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQuotaResult> getQuota(GetQuotaArgs args) {
        return getQuota(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Quota resource in Oracle Cloud Infrastructure Limits service.
     * 
     * Gets the quota for the OCID specified.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQuotaResult> getQuota(GetQuotaArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getQuota:getQuota", TypeShape.of(GetQuotaResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Quotas in Oracle Cloud Infrastructure Limits service.
     * 
     * Lists all quotas on resources from the given compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQuotasResult> getQuotas(GetQuotasArgs args) {
        return getQuotas(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Quotas in Oracle Cloud Infrastructure Limits service.
     * 
     * Lists all quotas on resources from the given compartment.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetQuotasResult> getQuotas(GetQuotasArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getQuotas:getQuotas", TypeShape.of(GetQuotasResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides details about a specific Resource Availability resource in Oracle Cloud Infrastructure Limits service.
     * 
     * For a given compartmentId, resource limit name, and scope, returns the following:
     *   * The number of available resources associated with the given limit.
     *   * The usage in the selected compartment for the given limit.
     *       Note that not all resource limits support this API. If the value is not available, the API returns a 404 response.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetResourceAvailabilityResult> getResourceAvailability(GetResourceAvailabilityArgs args) {
        return getResourceAvailability(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides details about a specific Resource Availability resource in Oracle Cloud Infrastructure Limits service.
     * 
     * For a given compartmentId, resource limit name, and scope, returns the following:
     *   * The number of available resources associated with the given limit.
     *   * The usage in the selected compartment for the given limit.
     *       Note that not all resource limits support this API. If the value is not available, the API returns a 404 response.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetResourceAvailabilityResult> getResourceAvailability(GetResourceAvailabilityArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getResourceAvailability:getResourceAvailability", TypeShape.of(GetResourceAvailabilityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the list of Services in Oracle Cloud Infrastructure Limits service.
     * 
     * Returns the list of supported services.
     * This includes the programmatic service name, along with the friendly service name.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServicesResult> getServices(GetServicesArgs args) {
        return getServices(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the list of Services in Oracle Cloud Infrastructure Limits service.
     * 
     * Returns the list of supported services.
     * This includes the programmatic service name, along with the friendly service name.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetServicesResult> getServices(GetServicesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("oci:Limits/getServices:getServices", TypeShape.of(GetServicesResult.class), args, Utilities.withVersion(options));
    }
}

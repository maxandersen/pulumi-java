// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabric.inputs;

import com.pulumi.azurenative.servicefabric.inputs.ArmServiceTypeHealthPolicyArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.ResourceArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines a health policy used to evaluate the health of an application or one of its children entities.
 * 
 */
public final class ArmApplicationHealthPolicyArgs extends ResourceArgs {

    public static final ArmApplicationHealthPolicyArgs Empty = new ArmApplicationHealthPolicyArgs();

    /**
     * Indicates whether warnings are treated with the same severity as errors.
     * 
     */
    @Import(name="considerWarningAsError")
    private @Nullable Output<Boolean> considerWarningAsError;

    /**
     * @return Indicates whether warnings are treated with the same severity as errors.
     * 
     */
    public Optional<Output<Boolean>> considerWarningAsError() {
        return Optional.ofNullable(this.considerWarningAsError);
    }

    /**
     * The health policy used by default to evaluate the health of a service type.
     * 
     */
    @Import(name="defaultServiceTypeHealthPolicy")
    private @Nullable Output<ArmServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy;

    /**
     * @return The health policy used by default to evaluate the health of a service type.
     * 
     */
    public Optional<Output<ArmServiceTypeHealthPolicyArgs>> defaultServiceTypeHealthPolicy() {
        return Optional.ofNullable(this.defaultServiceTypeHealthPolicy);
    }

    /**
     * The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
     * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
     * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     */
    @Import(name="maxPercentUnhealthyDeployedApplications")
    private @Nullable Output<Integer> maxPercentUnhealthyDeployedApplications;

    /**
     * @return The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
     * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
     * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
     * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
     * 
     */
    public Optional<Output<Integer>> maxPercentUnhealthyDeployedApplications() {
        return Optional.ofNullable(this.maxPercentUnhealthyDeployedApplications);
    }

    /**
     * The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    @Import(name="serviceTypeHealthPolicyMap")
    private @Nullable Output<Map<String,ArmServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicyMap;

    /**
     * @return The map with service type health policy per service type name. The map is empty by default.
     * 
     */
    public Optional<Output<Map<String,ArmServiceTypeHealthPolicyArgs>>> serviceTypeHealthPolicyMap() {
        return Optional.ofNullable(this.serviceTypeHealthPolicyMap);
    }

    private ArmApplicationHealthPolicyArgs() {}

    private ArmApplicationHealthPolicyArgs(ArmApplicationHealthPolicyArgs $) {
        this.considerWarningAsError = $.considerWarningAsError;
        this.defaultServiceTypeHealthPolicy = $.defaultServiceTypeHealthPolicy;
        this.maxPercentUnhealthyDeployedApplications = $.maxPercentUnhealthyDeployedApplications;
        this.serviceTypeHealthPolicyMap = $.serviceTypeHealthPolicyMap;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ArmApplicationHealthPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ArmApplicationHealthPolicyArgs $;

        public Builder() {
            $ = new ArmApplicationHealthPolicyArgs();
        }

        public Builder(ArmApplicationHealthPolicyArgs defaults) {
            $ = new ArmApplicationHealthPolicyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param considerWarningAsError Indicates whether warnings are treated with the same severity as errors.
         * 
         * @return builder
         * 
         */
        public Builder considerWarningAsError(@Nullable Output<Boolean> considerWarningAsError) {
            $.considerWarningAsError = considerWarningAsError;
            return this;
        }

        /**
         * @param considerWarningAsError Indicates whether warnings are treated with the same severity as errors.
         * 
         * @return builder
         * 
         */
        public Builder considerWarningAsError(Boolean considerWarningAsError) {
            return considerWarningAsError(Output.of(considerWarningAsError));
        }

        /**
         * @param defaultServiceTypeHealthPolicy The health policy used by default to evaluate the health of a service type.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceTypeHealthPolicy(@Nullable Output<ArmServiceTypeHealthPolicyArgs> defaultServiceTypeHealthPolicy) {
            $.defaultServiceTypeHealthPolicy = defaultServiceTypeHealthPolicy;
            return this;
        }

        /**
         * @param defaultServiceTypeHealthPolicy The health policy used by default to evaluate the health of a service type.
         * 
         * @return builder
         * 
         */
        public Builder defaultServiceTypeHealthPolicy(ArmServiceTypeHealthPolicyArgs defaultServiceTypeHealthPolicy) {
            return defaultServiceTypeHealthPolicy(Output.of(defaultServiceTypeHealthPolicy));
        }

        /**
         * @param maxPercentUnhealthyDeployedApplications The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
         * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
         * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
         * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
         * 
         * @return builder
         * 
         */
        public Builder maxPercentUnhealthyDeployedApplications(@Nullable Output<Integer> maxPercentUnhealthyDeployedApplications) {
            $.maxPercentUnhealthyDeployedApplications = maxPercentUnhealthyDeployedApplications;
            return this;
        }

        /**
         * @param maxPercentUnhealthyDeployedApplications The maximum allowed percentage of unhealthy deployed applications. Allowed values are Byte values from zero to 100.
         * The percentage represents the maximum tolerated percentage of deployed applications that can be unhealthy before the application is considered in error.
         * This is calculated by dividing the number of unhealthy deployed applications over the number of nodes where the application is currently deployed on in the cluster.
         * The computation rounds up to tolerate one failure on small numbers of nodes. Default percentage is zero.
         * 
         * @return builder
         * 
         */
        public Builder maxPercentUnhealthyDeployedApplications(Integer maxPercentUnhealthyDeployedApplications) {
            return maxPercentUnhealthyDeployedApplications(Output.of(maxPercentUnhealthyDeployedApplications));
        }

        /**
         * @param serviceTypeHealthPolicyMap The map with service type health policy per service type name. The map is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder serviceTypeHealthPolicyMap(@Nullable Output<Map<String,ArmServiceTypeHealthPolicyArgs>> serviceTypeHealthPolicyMap) {
            $.serviceTypeHealthPolicyMap = serviceTypeHealthPolicyMap;
            return this;
        }

        /**
         * @param serviceTypeHealthPolicyMap The map with service type health policy per service type name. The map is empty by default.
         * 
         * @return builder
         * 
         */
        public Builder serviceTypeHealthPolicyMap(Map<String,ArmServiceTypeHealthPolicyArgs> serviceTypeHealthPolicyMap) {
            return serviceTypeHealthPolicyMap(Output.of(serviceTypeHealthPolicyMap));
        }

        public ArmApplicationHealthPolicyArgs build() {
            $.considerWarningAsError = Codegen.booleanProp("considerWarningAsError").output().arg($.considerWarningAsError).def(false).getNullable();
            $.maxPercentUnhealthyDeployedApplications = Codegen.integerProp("maxPercentUnhealthyDeployedApplications").output().arg($.maxPercentUnhealthyDeployedApplications).def(0).getNullable();
            return $;
        }
    }

}

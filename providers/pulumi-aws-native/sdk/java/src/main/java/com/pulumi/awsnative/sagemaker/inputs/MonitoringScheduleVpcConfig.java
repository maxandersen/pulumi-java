// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.sagemaker.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specifies a VPC that your training jobs and hosted models have access to. Control access to and from your training and model containers by configuring the VPC.
 * 
 */
public final class MonitoringScheduleVpcConfig extends com.pulumi.resources.InvokeArgs {

    public static final MonitoringScheduleVpcConfig Empty = new MonitoringScheduleVpcConfig();

    /**
     * The VPC security group IDs, in the form sg-xxxxxxxx. Specify the security groups for the VPC that is specified in the Subnets field.
     * 
     */
    @Import(name="securityGroupIds", required=true)
    private List<String> securityGroupIds;

    public List<String> securityGroupIds() {
        return this.securityGroupIds;
    }

    /**
     * The ID of the subnets in the VPC to which you want to connect to your monitoring jobs.
     * 
     */
    @Import(name="subnets", required=true)
    private List<String> subnets;

    public List<String> subnets() {
        return this.subnets;
    }

    private MonitoringScheduleVpcConfig() {}

    private MonitoringScheduleVpcConfig(MonitoringScheduleVpcConfig $) {
        this.securityGroupIds = $.securityGroupIds;
        this.subnets = $.subnets;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitoringScheduleVpcConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitoringScheduleVpcConfig $;

        public Builder() {
            $ = new MonitoringScheduleVpcConfig();
        }

        public Builder(MonitoringScheduleVpcConfig defaults) {
            $ = new MonitoringScheduleVpcConfig(Objects.requireNonNull(defaults));
        }

        public Builder securityGroupIds(List<String> securityGroupIds) {
            $.securityGroupIds = securityGroupIds;
            return this;
        }

        public Builder securityGroupIds(String... securityGroupIds) {
            return securityGroupIds(List.of(securityGroupIds));
        }

        public Builder subnets(List<String> subnets) {
            $.subnets = subnets;
            return this;
        }

        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }

        public MonitoringScheduleVpcConfig build() {
            $.securityGroupIds = Objects.requireNonNull($.securityGroupIds, "expected parameter 'securityGroupIds' to be non-null");
            $.subnets = Objects.requireNonNull($.subnets, "expected parameter 'subnets' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.inputs.GetAmiArgs;
import com.pulumi.aws.inputs.GetAmiIdsArgs;
import com.pulumi.aws.inputs.GetArnArgs;
import com.pulumi.aws.inputs.GetAutoscalingGroupsArgs;
import com.pulumi.aws.inputs.GetAvailabilityZoneArgs;
import com.pulumi.aws.inputs.GetAvailabilityZonesArgs;
import com.pulumi.aws.inputs.GetDefaultTagsArgs;
import com.pulumi.aws.inputs.GetElasticIpArgs;
import com.pulumi.aws.inputs.GetIpRangesArgs;
import com.pulumi.aws.inputs.GetPrefixListArgs;
import com.pulumi.aws.inputs.GetRegionArgs;
import com.pulumi.aws.inputs.GetRegionsArgs;
import com.pulumi.aws.outputs.GetAmiIdsResult;
import com.pulumi.aws.outputs.GetAmiResult;
import com.pulumi.aws.outputs.GetArnResult;
import com.pulumi.aws.outputs.GetAutoscalingGroupsResult;
import com.pulumi.aws.outputs.GetAvailabilityZoneResult;
import com.pulumi.aws.outputs.GetAvailabilityZonesResult;
import com.pulumi.aws.outputs.GetBillingServiceAccountResult;
import com.pulumi.aws.outputs.GetCallerIdentityResult;
import com.pulumi.aws.outputs.GetCanonicalUserIdResult;
import com.pulumi.aws.outputs.GetDefaultTagsResult;
import com.pulumi.aws.outputs.GetElasticIpResult;
import com.pulumi.aws.outputs.GetIpRangesResult;
import com.pulumi.aws.outputs.GetPartitionResult;
import com.pulumi.aws.outputs.GetPrefixListResult;
import com.pulumi.aws.outputs.GetRegionResult;
import com.pulumi.aws.outputs.GetRegionsResult;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.resources.InvokeArgs;
import java.util.concurrent.CompletableFuture;

public final class AwsFunctions {
    /**
     * Use this data source to get the ID of a registered AMI for use in other
     * resources.
     * 
     * ## Example Usage
     * 
     * @deprecated
     * aws.getAmi has been deprecated in favor of aws.ec2.getAmi
     * 
     */
    @Deprecated /* aws.getAmi has been deprecated in favor of aws.ec2.getAmi */
    public static CompletableFuture<GetAmiResult> getAmi(GetAmiArgs args) {
        return getAmi(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAmiResult> getAmi(GetAmiArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAmi:getAmi", TypeShape.of(GetAmiResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get a list of AMI IDs matching the specified criteria.
     * 
     * ## Example Usage
     * 
     * @deprecated
     * aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds
     * 
     */
    @Deprecated /* aws.getAmiIds has been deprecated in favor of aws.ec2.getAmiIds */
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args) {
        return getAmiIds(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAmiIdsResult> getAmiIds(GetAmiIdsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAmiIds:getAmiIds", TypeShape.of(GetAmiIdsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Parses an Amazon Resource Name (ARN) into its constituent parts.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetArnResult> getArn(GetArnArgs args) {
        return getArn(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetArnResult> getArn(GetArnArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getArn:getArn", TypeShape.of(GetArnResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Autoscaling Groups data source allows access to the list of AWS
     * ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
     * 
     * ## Example Usage
     * 
     * @deprecated
     * aws.getAutoscalingGroups has been deprecated in favor of aws.autoscaling.getAmiIds
     * 
     */
    @Deprecated /* aws.getAutoscalingGroups has been deprecated in favor of aws.autoscaling.getAmiIds */
    public static CompletableFuture<GetAutoscalingGroupsResult> getAutoscalingGroups() {
        return getAutoscalingGroups(GetAutoscalingGroupsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAutoscalingGroupsResult> getAutoscalingGroups(GetAutoscalingGroupsArgs args) {
        return getAutoscalingGroups(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAutoscalingGroupsResult> getAutoscalingGroups(GetAutoscalingGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAutoscalingGroups:getAutoscalingGroups", TypeShape.of(GetAutoscalingGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.getAvailabilityZone` provides details about a specific availability zone (AZ)
     * in the current region.
     * 
     * This can be used both to validate an availability zone given in a variable
     * and to split the AZ name into its component parts of an AWS region and an
     * AZ identifier letter. The latter may be useful e.g., for implementing a
     * consistent subnet numbering scheme across several regions by mapping both
     * the region and the subnet letter to network numbers.
     * 
     * This is different from the `aws.getAvailabilityZones` (plural) data source,
     * which provides a list of the available zones.
     * 
     */
    public static CompletableFuture<GetAvailabilityZoneResult> getAvailabilityZone() {
        return getAvailabilityZone(GetAvailabilityZoneArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAvailabilityZoneResult> getAvailabilityZone(GetAvailabilityZoneArgs args) {
        return getAvailabilityZone(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAvailabilityZoneResult> getAvailabilityZone(GetAvailabilityZoneArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAvailabilityZone:getAvailabilityZone", TypeShape.of(GetAvailabilityZoneResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Availability Zones data source allows access to the list of AWS
     * Availability Zones which can be accessed by an AWS account within the region
     * configured in the provider.
     * 
     * This is different from the `aws.getAvailabilityZone` (singular) data source,
     * which provides some details about a specific availability zone.
     * 
     * &gt; When [Local Zones](https://aws.amazon.com/about-aws/global-infrastructure/localzones/) are enabled in a region, by default the API and this data source include both Local Zones and Availability Zones. To return only Availability Zones, see the example section below.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetAvailabilityZonesResult> getAvailabilityZones() {
        return getAvailabilityZones(GetAvailabilityZonesArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAvailabilityZonesResult> getAvailabilityZones(GetAvailabilityZonesArgs args) {
        return getAvailabilityZones(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetAvailabilityZonesResult> getAvailabilityZones(GetAvailabilityZonesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getAvailabilityZones:getAvailabilityZones", TypeShape.of(GetAvailabilityZonesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the Account ID of the [AWS Billing and Cost Management Service Account](http://docs.aws.amazon.com/awsaccountbilling/latest/aboutv2/billing-getting-started.html#step-2) for the purpose of permitting in S3 bucket policy.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetBillingServiceAccountResult> getBillingServiceAccount() {
        return getBillingServiceAccount(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBillingServiceAccountResult> getBillingServiceAccount(InvokeArgs args) {
        return getBillingServiceAccount(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetBillingServiceAccountResult> getBillingServiceAccount(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getBillingServiceAccount:getBillingServiceAccount", TypeShape.of(GetBillingServiceAccountResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the access to the effective Account ID, User ID, and ARN in
     * which this provider is authorized.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetCallerIdentityResult> getCallerIdentity() {
        return getCallerIdentity(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCallerIdentityResult> getCallerIdentity(InvokeArgs args) {
        return getCallerIdentity(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCallerIdentityResult> getCallerIdentity(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getCallerIdentity:getCallerIdentity", TypeShape.of(GetCallerIdentityResult.class), args, Utilities.withVersion(options));
    }
    /**
     * The Canonical User ID data source allows access to the [canonical user ID](http://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html)
     * for the effective account in which this provider is working.
     * 
     * ## Example Usage
     * 
     * @deprecated
     * aws.getCanonicalUserId has been deprecated in favor of aws.s3.getCanonicalUserId
     * 
     */
    @Deprecated /* aws.getCanonicalUserId has been deprecated in favor of aws.s3.getCanonicalUserId */
    public static CompletableFuture<GetCanonicalUserIdResult> getCanonicalUserId() {
        return getCanonicalUserId(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCanonicalUserIdResult> getCanonicalUserId(InvokeArgs args) {
        return getCanonicalUserId(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetCanonicalUserIdResult> getCanonicalUserId(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getCanonicalUserId:getCanonicalUserId", TypeShape.of(GetCanonicalUserIdResult.class), args, Utilities.withVersion(options));
    }
    public static CompletableFuture<GetDefaultTagsResult> getDefaultTags() {
        return getDefaultTags(GetDefaultTagsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDefaultTagsResult> getDefaultTags(GetDefaultTagsArgs args) {
        return getDefaultTags(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetDefaultTagsResult> getDefaultTags(GetDefaultTagsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getDefaultTags:getDefaultTags", TypeShape.of(GetDefaultTagsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.ec2.Eip` provides details about a specific Elastic IP.
     * 
     * ## Example Usage
     * 
     * @deprecated
     * aws.getElasticIp has been deprecated in favor of aws.ec2.getElasticIp
     * 
     */
    @Deprecated /* aws.getElasticIp has been deprecated in favor of aws.ec2.getElasticIp */
    public static CompletableFuture<GetElasticIpResult> getElasticIp() {
        return getElasticIp(GetElasticIpArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetElasticIpResult> getElasticIp(GetElasticIpArgs args) {
        return getElasticIp(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetElasticIpResult> getElasticIp(GetElasticIpArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getElasticIp:getElasticIp", TypeShape.of(GetElasticIpResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to get the IP ranges of various AWS products and services. For more information about the contents of this data source and required JSON syntax if referencing a custom URL, see the [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html).
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetIpRangesResult> getIpRanges(GetIpRangesArgs args) {
        return getIpRanges(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetIpRangesResult> getIpRanges(GetIpRangesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getIpRanges:getIpRanges", TypeShape.of(GetIpRangesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Use this data source to lookup current AWS partition in which this provider is working
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetPartitionResult> getPartition() {
        return getPartition(InvokeArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartitionResult> getPartition(InvokeArgs args) {
        return getPartition(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPartitionResult> getPartition(InvokeArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getPartition:getPartition", TypeShape.of(GetPartitionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * 
     * @deprecated
     * aws.getPrefixList has been deprecated in favor of aws.ec2.getPrefixList
     * 
     */
    @Deprecated /* aws.getPrefixList has been deprecated in favor of aws.ec2.getPrefixList */
    public static CompletableFuture<GetPrefixListResult> getPrefixList() {
        return getPrefixList(GetPrefixListArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrefixListResult> getPrefixList(GetPrefixListArgs args) {
        return getPrefixList(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPrefixListResult> getPrefixList(GetPrefixListArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getPrefixList:getPrefixList", TypeShape.of(GetPrefixListResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `aws.getRegion` provides details about a specific AWS region.
     * 
     * As well as validating a given region name this resource can be used to
     * discover the name of the region configured within the provider. The latter
     * can be useful in a child module which is inheriting an AWS provider
     * configuration from its parent module.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRegionResult> getRegion() {
        return getRegion(GetRegionArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegionResult> getRegion(GetRegionArgs args) {
        return getRegion(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegionResult> getRegion(GetRegionArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getRegion:getRegion", TypeShape.of(GetRegionResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides information about AWS Regions. Can be used to filter regions i.e., by Opt-In status or only regions enabled for current account. To get details like endpoint and description of each region the data source can be combined with the `aws.getRegion` data source.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetRegionsResult> getRegions() {
        return getRegions(GetRegionsArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegionsResult> getRegions(GetRegionsArgs args) {
        return getRegions(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegionsResult> getRegions(GetRegionsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("aws:index/getRegions:getRegions", TypeShape.of(GetRegionsResult.class), args, Utilities.withVersion(options));
    }
}

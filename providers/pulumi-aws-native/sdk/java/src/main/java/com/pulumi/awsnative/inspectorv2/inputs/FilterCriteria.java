// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.inputs;

import com.pulumi.awsnative.inspectorv2.inputs.FilterDateFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterMapFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterNumberFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterPackageFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterPortRangeFilter;
import com.pulumi.awsnative.inspectorv2.inputs.FilterStringFilter;
import com.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FilterCriteria extends com.pulumi.resources.InvokeArgs {

    public static final FilterCriteria Empty = new FilterCriteria();

    @Import(name="awsAccountId")
    private @Nullable List<FilterStringFilter> awsAccountId;

    public Optional<List<FilterStringFilter>> awsAccountId() {
        return Optional.ofNullable(this.awsAccountId);
    }

    @Import(name="componentId")
    private @Nullable List<FilterStringFilter> componentId;

    public Optional<List<FilterStringFilter>> componentId() {
        return Optional.ofNullable(this.componentId);
    }

    @Import(name="componentType")
    private @Nullable List<FilterStringFilter> componentType;

    public Optional<List<FilterStringFilter>> componentType() {
        return Optional.ofNullable(this.componentType);
    }

    @Import(name="ec2InstanceImageId")
    private @Nullable List<FilterStringFilter> ec2InstanceImageId;

    public Optional<List<FilterStringFilter>> ec2InstanceImageId() {
        return Optional.ofNullable(this.ec2InstanceImageId);
    }

    @Import(name="ec2InstanceSubnetId")
    private @Nullable List<FilterStringFilter> ec2InstanceSubnetId;

    public Optional<List<FilterStringFilter>> ec2InstanceSubnetId() {
        return Optional.ofNullable(this.ec2InstanceSubnetId);
    }

    @Import(name="ec2InstanceVpcId")
    private @Nullable List<FilterStringFilter> ec2InstanceVpcId;

    public Optional<List<FilterStringFilter>> ec2InstanceVpcId() {
        return Optional.ofNullable(this.ec2InstanceVpcId);
    }

    @Import(name="ecrImageArchitecture")
    private @Nullable List<FilterStringFilter> ecrImageArchitecture;

    public Optional<List<FilterStringFilter>> ecrImageArchitecture() {
        return Optional.ofNullable(this.ecrImageArchitecture);
    }

    @Import(name="ecrImageHash")
    private @Nullable List<FilterStringFilter> ecrImageHash;

    public Optional<List<FilterStringFilter>> ecrImageHash() {
        return Optional.ofNullable(this.ecrImageHash);
    }

    @Import(name="ecrImagePushedAt")
    private @Nullable List<FilterDateFilter> ecrImagePushedAt;

    public Optional<List<FilterDateFilter>> ecrImagePushedAt() {
        return Optional.ofNullable(this.ecrImagePushedAt);
    }

    @Import(name="ecrImageRegistry")
    private @Nullable List<FilterStringFilter> ecrImageRegistry;

    public Optional<List<FilterStringFilter>> ecrImageRegistry() {
        return Optional.ofNullable(this.ecrImageRegistry);
    }

    @Import(name="ecrImageRepositoryName")
    private @Nullable List<FilterStringFilter> ecrImageRepositoryName;

    public Optional<List<FilterStringFilter>> ecrImageRepositoryName() {
        return Optional.ofNullable(this.ecrImageRepositoryName);
    }

    @Import(name="ecrImageTags")
    private @Nullable List<FilterStringFilter> ecrImageTags;

    public Optional<List<FilterStringFilter>> ecrImageTags() {
        return Optional.ofNullable(this.ecrImageTags);
    }

    @Import(name="findingArn")
    private @Nullable List<FilterStringFilter> findingArn;

    public Optional<List<FilterStringFilter>> findingArn() {
        return Optional.ofNullable(this.findingArn);
    }

    @Import(name="findingStatus")
    private @Nullable List<FilterStringFilter> findingStatus;

    public Optional<List<FilterStringFilter>> findingStatus() {
        return Optional.ofNullable(this.findingStatus);
    }

    @Import(name="findingType")
    private @Nullable List<FilterStringFilter> findingType;

    public Optional<List<FilterStringFilter>> findingType() {
        return Optional.ofNullable(this.findingType);
    }

    @Import(name="firstObservedAt")
    private @Nullable List<FilterDateFilter> firstObservedAt;

    public Optional<List<FilterDateFilter>> firstObservedAt() {
        return Optional.ofNullable(this.firstObservedAt);
    }

    @Import(name="inspectorScore")
    private @Nullable List<FilterNumberFilter> inspectorScore;

    public Optional<List<FilterNumberFilter>> inspectorScore() {
        return Optional.ofNullable(this.inspectorScore);
    }

    @Import(name="lastObservedAt")
    private @Nullable List<FilterDateFilter> lastObservedAt;

    public Optional<List<FilterDateFilter>> lastObservedAt() {
        return Optional.ofNullable(this.lastObservedAt);
    }

    @Import(name="networkProtocol")
    private @Nullable List<FilterStringFilter> networkProtocol;

    public Optional<List<FilterStringFilter>> networkProtocol() {
        return Optional.ofNullable(this.networkProtocol);
    }

    @Import(name="portRange")
    private @Nullable List<FilterPortRangeFilter> portRange;

    public Optional<List<FilterPortRangeFilter>> portRange() {
        return Optional.ofNullable(this.portRange);
    }

    @Import(name="relatedVulnerabilities")
    private @Nullable List<FilterStringFilter> relatedVulnerabilities;

    public Optional<List<FilterStringFilter>> relatedVulnerabilities() {
        return Optional.ofNullable(this.relatedVulnerabilities);
    }

    @Import(name="resourceId")
    private @Nullable List<FilterStringFilter> resourceId;

    public Optional<List<FilterStringFilter>> resourceId() {
        return Optional.ofNullable(this.resourceId);
    }

    @Import(name="resourceTags")
    private @Nullable List<FilterMapFilter> resourceTags;

    public Optional<List<FilterMapFilter>> resourceTags() {
        return Optional.ofNullable(this.resourceTags);
    }

    @Import(name="resourceType")
    private @Nullable List<FilterStringFilter> resourceType;

    public Optional<List<FilterStringFilter>> resourceType() {
        return Optional.ofNullable(this.resourceType);
    }

    @Import(name="severity")
    private @Nullable List<FilterStringFilter> severity;

    public Optional<List<FilterStringFilter>> severity() {
        return Optional.ofNullable(this.severity);
    }

    @Import(name="title")
    private @Nullable List<FilterStringFilter> title;

    public Optional<List<FilterStringFilter>> title() {
        return Optional.ofNullable(this.title);
    }

    @Import(name="updatedAt")
    private @Nullable List<FilterDateFilter> updatedAt;

    public Optional<List<FilterDateFilter>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    @Import(name="vendorSeverity")
    private @Nullable List<FilterStringFilter> vendorSeverity;

    public Optional<List<FilterStringFilter>> vendorSeverity() {
        return Optional.ofNullable(this.vendorSeverity);
    }

    @Import(name="vulnerabilityId")
    private @Nullable List<FilterStringFilter> vulnerabilityId;

    public Optional<List<FilterStringFilter>> vulnerabilityId() {
        return Optional.ofNullable(this.vulnerabilityId);
    }

    @Import(name="vulnerabilitySource")
    private @Nullable List<FilterStringFilter> vulnerabilitySource;

    public Optional<List<FilterStringFilter>> vulnerabilitySource() {
        return Optional.ofNullable(this.vulnerabilitySource);
    }

    @Import(name="vulnerablePackages")
    private @Nullable List<FilterPackageFilter> vulnerablePackages;

    public Optional<List<FilterPackageFilter>> vulnerablePackages() {
        return Optional.ofNullable(this.vulnerablePackages);
    }

    private FilterCriteria() {}

    private FilterCriteria(FilterCriteria $) {
        this.awsAccountId = $.awsAccountId;
        this.componentId = $.componentId;
        this.componentType = $.componentType;
        this.ec2InstanceImageId = $.ec2InstanceImageId;
        this.ec2InstanceSubnetId = $.ec2InstanceSubnetId;
        this.ec2InstanceVpcId = $.ec2InstanceVpcId;
        this.ecrImageArchitecture = $.ecrImageArchitecture;
        this.ecrImageHash = $.ecrImageHash;
        this.ecrImagePushedAt = $.ecrImagePushedAt;
        this.ecrImageRegistry = $.ecrImageRegistry;
        this.ecrImageRepositoryName = $.ecrImageRepositoryName;
        this.ecrImageTags = $.ecrImageTags;
        this.findingArn = $.findingArn;
        this.findingStatus = $.findingStatus;
        this.findingType = $.findingType;
        this.firstObservedAt = $.firstObservedAt;
        this.inspectorScore = $.inspectorScore;
        this.lastObservedAt = $.lastObservedAt;
        this.networkProtocol = $.networkProtocol;
        this.portRange = $.portRange;
        this.relatedVulnerabilities = $.relatedVulnerabilities;
        this.resourceId = $.resourceId;
        this.resourceTags = $.resourceTags;
        this.resourceType = $.resourceType;
        this.severity = $.severity;
        this.title = $.title;
        this.updatedAt = $.updatedAt;
        this.vendorSeverity = $.vendorSeverity;
        this.vulnerabilityId = $.vulnerabilityId;
        this.vulnerabilitySource = $.vulnerabilitySource;
        this.vulnerablePackages = $.vulnerablePackages;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FilterCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FilterCriteria $;

        public Builder() {
            $ = new FilterCriteria();
        }

        public Builder(FilterCriteria defaults) {
            $ = new FilterCriteria(Objects.requireNonNull(defaults));
        }

        public Builder awsAccountId(@Nullable List<FilterStringFilter> awsAccountId) {
            $.awsAccountId = awsAccountId;
            return this;
        }

        public Builder awsAccountId(FilterStringFilter... awsAccountId) {
            return awsAccountId(List.of(awsAccountId));
        }

        public Builder componentId(@Nullable List<FilterStringFilter> componentId) {
            $.componentId = componentId;
            return this;
        }

        public Builder componentId(FilterStringFilter... componentId) {
            return componentId(List.of(componentId));
        }

        public Builder componentType(@Nullable List<FilterStringFilter> componentType) {
            $.componentType = componentType;
            return this;
        }

        public Builder componentType(FilterStringFilter... componentType) {
            return componentType(List.of(componentType));
        }

        public Builder ec2InstanceImageId(@Nullable List<FilterStringFilter> ec2InstanceImageId) {
            $.ec2InstanceImageId = ec2InstanceImageId;
            return this;
        }

        public Builder ec2InstanceImageId(FilterStringFilter... ec2InstanceImageId) {
            return ec2InstanceImageId(List.of(ec2InstanceImageId));
        }

        public Builder ec2InstanceSubnetId(@Nullable List<FilterStringFilter> ec2InstanceSubnetId) {
            $.ec2InstanceSubnetId = ec2InstanceSubnetId;
            return this;
        }

        public Builder ec2InstanceSubnetId(FilterStringFilter... ec2InstanceSubnetId) {
            return ec2InstanceSubnetId(List.of(ec2InstanceSubnetId));
        }

        public Builder ec2InstanceVpcId(@Nullable List<FilterStringFilter> ec2InstanceVpcId) {
            $.ec2InstanceVpcId = ec2InstanceVpcId;
            return this;
        }

        public Builder ec2InstanceVpcId(FilterStringFilter... ec2InstanceVpcId) {
            return ec2InstanceVpcId(List.of(ec2InstanceVpcId));
        }

        public Builder ecrImageArchitecture(@Nullable List<FilterStringFilter> ecrImageArchitecture) {
            $.ecrImageArchitecture = ecrImageArchitecture;
            return this;
        }

        public Builder ecrImageArchitecture(FilterStringFilter... ecrImageArchitecture) {
            return ecrImageArchitecture(List.of(ecrImageArchitecture));
        }

        public Builder ecrImageHash(@Nullable List<FilterStringFilter> ecrImageHash) {
            $.ecrImageHash = ecrImageHash;
            return this;
        }

        public Builder ecrImageHash(FilterStringFilter... ecrImageHash) {
            return ecrImageHash(List.of(ecrImageHash));
        }

        public Builder ecrImagePushedAt(@Nullable List<FilterDateFilter> ecrImagePushedAt) {
            $.ecrImagePushedAt = ecrImagePushedAt;
            return this;
        }

        public Builder ecrImagePushedAt(FilterDateFilter... ecrImagePushedAt) {
            return ecrImagePushedAt(List.of(ecrImagePushedAt));
        }

        public Builder ecrImageRegistry(@Nullable List<FilterStringFilter> ecrImageRegistry) {
            $.ecrImageRegistry = ecrImageRegistry;
            return this;
        }

        public Builder ecrImageRegistry(FilterStringFilter... ecrImageRegistry) {
            return ecrImageRegistry(List.of(ecrImageRegistry));
        }

        public Builder ecrImageRepositoryName(@Nullable List<FilterStringFilter> ecrImageRepositoryName) {
            $.ecrImageRepositoryName = ecrImageRepositoryName;
            return this;
        }

        public Builder ecrImageRepositoryName(FilterStringFilter... ecrImageRepositoryName) {
            return ecrImageRepositoryName(List.of(ecrImageRepositoryName));
        }

        public Builder ecrImageTags(@Nullable List<FilterStringFilter> ecrImageTags) {
            $.ecrImageTags = ecrImageTags;
            return this;
        }

        public Builder ecrImageTags(FilterStringFilter... ecrImageTags) {
            return ecrImageTags(List.of(ecrImageTags));
        }

        public Builder findingArn(@Nullable List<FilterStringFilter> findingArn) {
            $.findingArn = findingArn;
            return this;
        }

        public Builder findingArn(FilterStringFilter... findingArn) {
            return findingArn(List.of(findingArn));
        }

        public Builder findingStatus(@Nullable List<FilterStringFilter> findingStatus) {
            $.findingStatus = findingStatus;
            return this;
        }

        public Builder findingStatus(FilterStringFilter... findingStatus) {
            return findingStatus(List.of(findingStatus));
        }

        public Builder findingType(@Nullable List<FilterStringFilter> findingType) {
            $.findingType = findingType;
            return this;
        }

        public Builder findingType(FilterStringFilter... findingType) {
            return findingType(List.of(findingType));
        }

        public Builder firstObservedAt(@Nullable List<FilterDateFilter> firstObservedAt) {
            $.firstObservedAt = firstObservedAt;
            return this;
        }

        public Builder firstObservedAt(FilterDateFilter... firstObservedAt) {
            return firstObservedAt(List.of(firstObservedAt));
        }

        public Builder inspectorScore(@Nullable List<FilterNumberFilter> inspectorScore) {
            $.inspectorScore = inspectorScore;
            return this;
        }

        public Builder inspectorScore(FilterNumberFilter... inspectorScore) {
            return inspectorScore(List.of(inspectorScore));
        }

        public Builder lastObservedAt(@Nullable List<FilterDateFilter> lastObservedAt) {
            $.lastObservedAt = lastObservedAt;
            return this;
        }

        public Builder lastObservedAt(FilterDateFilter... lastObservedAt) {
            return lastObservedAt(List.of(lastObservedAt));
        }

        public Builder networkProtocol(@Nullable List<FilterStringFilter> networkProtocol) {
            $.networkProtocol = networkProtocol;
            return this;
        }

        public Builder networkProtocol(FilterStringFilter... networkProtocol) {
            return networkProtocol(List.of(networkProtocol));
        }

        public Builder portRange(@Nullable List<FilterPortRangeFilter> portRange) {
            $.portRange = portRange;
            return this;
        }

        public Builder portRange(FilterPortRangeFilter... portRange) {
            return portRange(List.of(portRange));
        }

        public Builder relatedVulnerabilities(@Nullable List<FilterStringFilter> relatedVulnerabilities) {
            $.relatedVulnerabilities = relatedVulnerabilities;
            return this;
        }

        public Builder relatedVulnerabilities(FilterStringFilter... relatedVulnerabilities) {
            return relatedVulnerabilities(List.of(relatedVulnerabilities));
        }

        public Builder resourceId(@Nullable List<FilterStringFilter> resourceId) {
            $.resourceId = resourceId;
            return this;
        }

        public Builder resourceId(FilterStringFilter... resourceId) {
            return resourceId(List.of(resourceId));
        }

        public Builder resourceTags(@Nullable List<FilterMapFilter> resourceTags) {
            $.resourceTags = resourceTags;
            return this;
        }

        public Builder resourceTags(FilterMapFilter... resourceTags) {
            return resourceTags(List.of(resourceTags));
        }

        public Builder resourceType(@Nullable List<FilterStringFilter> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(FilterStringFilter... resourceType) {
            return resourceType(List.of(resourceType));
        }

        public Builder severity(@Nullable List<FilterStringFilter> severity) {
            $.severity = severity;
            return this;
        }

        public Builder severity(FilterStringFilter... severity) {
            return severity(List.of(severity));
        }

        public Builder title(@Nullable List<FilterStringFilter> title) {
            $.title = title;
            return this;
        }

        public Builder title(FilterStringFilter... title) {
            return title(List.of(title));
        }

        public Builder updatedAt(@Nullable List<FilterDateFilter> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        public Builder updatedAt(FilterDateFilter... updatedAt) {
            return updatedAt(List.of(updatedAt));
        }

        public Builder vendorSeverity(@Nullable List<FilterStringFilter> vendorSeverity) {
            $.vendorSeverity = vendorSeverity;
            return this;
        }

        public Builder vendorSeverity(FilterStringFilter... vendorSeverity) {
            return vendorSeverity(List.of(vendorSeverity));
        }

        public Builder vulnerabilityId(@Nullable List<FilterStringFilter> vulnerabilityId) {
            $.vulnerabilityId = vulnerabilityId;
            return this;
        }

        public Builder vulnerabilityId(FilterStringFilter... vulnerabilityId) {
            return vulnerabilityId(List.of(vulnerabilityId));
        }

        public Builder vulnerabilitySource(@Nullable List<FilterStringFilter> vulnerabilitySource) {
            $.vulnerabilitySource = vulnerabilitySource;
            return this;
        }

        public Builder vulnerabilitySource(FilterStringFilter... vulnerabilitySource) {
            return vulnerabilitySource(List.of(vulnerabilitySource));
        }

        public Builder vulnerablePackages(@Nullable List<FilterPackageFilter> vulnerablePackages) {
            $.vulnerablePackages = vulnerablePackages;
            return this;
        }

        public Builder vulnerablePackages(FilterPackageFilter... vulnerablePackages) {
            return vulnerablePackages(List.of(vulnerablePackages));
        }

        public FilterCriteria build() {
            return $;
        }
    }

}

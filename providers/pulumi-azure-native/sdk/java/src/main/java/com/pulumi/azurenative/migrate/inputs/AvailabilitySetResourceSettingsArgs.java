// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Gets or sets the availability set resource settings.
 * 
 */
public final class AvailabilitySetResourceSettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AvailabilitySetResourceSettingsArgs Empty = new AvailabilitySetResourceSettingsArgs();

    /**
     * Gets or sets the target fault domain.
     * 
     */
    @Import(name="faultDomain")
    private @Nullable Output<Integer> faultDomain;

    public Optional<Output<Integer>> faultDomain() {
        return Optional.ofNullable(this.faultDomain);
    }

    /**
     * The resource type. For example, the value can be Microsoft.Compute/virtualMachines.
     * Expected value is &#39;Microsoft.Compute/availabilitySets&#39;.
     * 
     */
    @Import(name="resourceType", required=true)
    private Output<String> resourceType;

    public Output<String> resourceType() {
        return this.resourceType;
    }

    /**
     * Gets or sets the target Resource name.
     * 
     */
    @Import(name="targetResourceName", required=true)
    private Output<String> targetResourceName;

    public Output<String> targetResourceName() {
        return this.targetResourceName;
    }

    /**
     * Gets or sets the target update domain.
     * 
     */
    @Import(name="updateDomain")
    private @Nullable Output<Integer> updateDomain;

    public Optional<Output<Integer>> updateDomain() {
        return Optional.ofNullable(this.updateDomain);
    }

    private AvailabilitySetResourceSettingsArgs() {}

    private AvailabilitySetResourceSettingsArgs(AvailabilitySetResourceSettingsArgs $) {
        this.faultDomain = $.faultDomain;
        this.resourceType = $.resourceType;
        this.targetResourceName = $.targetResourceName;
        this.updateDomain = $.updateDomain;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AvailabilitySetResourceSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilitySetResourceSettingsArgs $;

        public Builder() {
            $ = new AvailabilitySetResourceSettingsArgs();
        }

        public Builder(AvailabilitySetResourceSettingsArgs defaults) {
            $ = new AvailabilitySetResourceSettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder faultDomain(@Nullable Output<Integer> faultDomain) {
            $.faultDomain = faultDomain;
            return this;
        }

        public Builder faultDomain(Integer faultDomain) {
            return faultDomain(Output.of(faultDomain));
        }

        public Builder resourceType(Output<String> resourceType) {
            $.resourceType = resourceType;
            return this;
        }

        public Builder resourceType(String resourceType) {
            return resourceType(Output.of(resourceType));
        }

        public Builder targetResourceName(Output<String> targetResourceName) {
            $.targetResourceName = targetResourceName;
            return this;
        }

        public Builder targetResourceName(String targetResourceName) {
            return targetResourceName(Output.of(targetResourceName));
        }

        public Builder updateDomain(@Nullable Output<Integer> updateDomain) {
            $.updateDomain = updateDomain;
            return this;
        }

        public Builder updateDomain(Integer updateDomain) {
            return updateDomain(Output.of(updateDomain));
        }

        public AvailabilitySetResourceSettingsArgs build() {
            $.resourceType = Codegen.stringProp("resourceType").output().arg($.resourceType).require();
            $.targetResourceName = Objects.requireNonNull($.targetResourceName, "expected parameter 'targetResourceName' to be non-null");
            return $;
        }
    }

}

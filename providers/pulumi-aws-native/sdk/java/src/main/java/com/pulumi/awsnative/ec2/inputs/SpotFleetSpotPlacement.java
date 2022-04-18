// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ec2.inputs;

import com.pulumi.awsnative.ec2.enums.SpotFleetSpotPlacementTenancy;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetSpotPlacement extends com.pulumi.resources.InvokeArgs {

    public static final SpotFleetSpotPlacement Empty = new SpotFleetSpotPlacement();

    @Import(name="availabilityZone")
      private final @Nullable String availabilityZone;

    public Optional<String> availabilityZone() {
        return this.availabilityZone == null ? Optional.empty() : Optional.ofNullable(this.availabilityZone);
    }

    @Import(name="groupName")
      private final @Nullable String groupName;

    public Optional<String> groupName() {
        return this.groupName == null ? Optional.empty() : Optional.ofNullable(this.groupName);
    }

    @Import(name="tenancy")
      private final @Nullable SpotFleetSpotPlacementTenancy tenancy;

    public Optional<SpotFleetSpotPlacementTenancy> tenancy() {
        return this.tenancy == null ? Optional.empty() : Optional.ofNullable(this.tenancy);
    }

    public SpotFleetSpotPlacement(
        @Nullable String availabilityZone,
        @Nullable String groupName,
        @Nullable SpotFleetSpotPlacementTenancy tenancy) {
        this.availabilityZone = availabilityZone;
        this.groupName = groupName;
        this.tenancy = tenancy;
    }

    private SpotFleetSpotPlacement() {
        this.availabilityZone = null;
        this.groupName = null;
        this.tenancy = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetSpotPlacement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String availabilityZone;
        private @Nullable String groupName;
        private @Nullable SpotFleetSpotPlacementTenancy tenancy;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetSpotPlacement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.groupName = defaults.groupName;
    	      this.tenancy = defaults.tenancy;
        }

        public Builder availabilityZone(@Nullable String availabilityZone) {
            this.availabilityZone = availabilityZone;
            return this;
        }
        public Builder groupName(@Nullable String groupName) {
            this.groupName = groupName;
            return this;
        }
        public Builder tenancy(@Nullable SpotFleetSpotPlacementTenancy tenancy) {
            this.tenancy = tenancy;
            return this;
        }        public SpotFleetSpotPlacement build() {
            return new SpotFleetSpotPlacement(availabilityZone, groupName, tenancy);
        }
    }
}

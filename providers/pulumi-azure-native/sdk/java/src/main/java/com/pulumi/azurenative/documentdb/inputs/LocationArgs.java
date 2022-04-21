// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.documentdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A region in which the Azure Cosmos DB database account is deployed.
 * 
 */
public final class LocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final LocationArgs Empty = new LocationArgs();

    /**
     * The failover priority of the region. A failover priority of 0 indicates a write region. The maximum value for a failover priority = (total number of regions - 1). Failover priority values must be unique for each of the regions in which the database account exists.
     * 
     */
    @Import(name="failoverPriority")
    private @Nullable Output<Integer> failoverPriority;

    public Optional<Output<Integer>> failoverPriority() {
        return Optional.ofNullable(this.failoverPriority);
    }

    /**
     * Flag to indicate whether or not this region is an AvailabilityZone region
     * 
     */
    @Import(name="isZoneRedundant")
    private @Nullable Output<Boolean> isZoneRedundant;

    public Optional<Output<Boolean>> isZoneRedundant() {
        return Optional.ofNullable(this.isZoneRedundant);
    }

    /**
     * The name of the region.
     * 
     */
    @Import(name="locationName")
    private @Nullable Output<String> locationName;

    public Optional<Output<String>> locationName() {
        return Optional.ofNullable(this.locationName);
    }

    private LocationArgs() {}

    private LocationArgs(LocationArgs $) {
        this.failoverPriority = $.failoverPriority;
        this.isZoneRedundant = $.isZoneRedundant;
        this.locationName = $.locationName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LocationArgs $;

        public Builder() {
            $ = new LocationArgs();
        }

        public Builder(LocationArgs defaults) {
            $ = new LocationArgs(Objects.requireNonNull(defaults));
        }

        public Builder failoverPriority(@Nullable Output<Integer> failoverPriority) {
            $.failoverPriority = failoverPriority;
            return this;
        }

        public Builder failoverPriority(Integer failoverPriority) {
            return failoverPriority(Output.of(failoverPriority));
        }

        public Builder isZoneRedundant(@Nullable Output<Boolean> isZoneRedundant) {
            $.isZoneRedundant = isZoneRedundant;
            return this;
        }

        public Builder isZoneRedundant(Boolean isZoneRedundant) {
            return isZoneRedundant(Output.of(isZoneRedundant));
        }

        public Builder locationName(@Nullable Output<String> locationName) {
            $.locationName = locationName;
            return this;
        }

        public Builder locationName(String locationName) {
            return locationName(Output.of(locationName));
        }

        public LocationArgs build() {
            return $;
        }
    }

}

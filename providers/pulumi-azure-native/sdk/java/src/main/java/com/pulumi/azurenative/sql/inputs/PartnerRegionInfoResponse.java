// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Partner region information for the failover group.
 * 
 */
public final class PartnerRegionInfoResponse extends com.pulumi.resources.InvokeArgs {

    public static final PartnerRegionInfoResponse Empty = new PartnerRegionInfoResponse();

    /**
     * Geo location of the partner managed instances.
     * 
     */
    @Import(name="location")
    private @Nullable String location;

    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }

    /**
     * Replication role of the partner managed instances.
     * 
     */
    @Import(name="replicationRole", required=true)
    private String replicationRole;

    public String replicationRole() {
        return this.replicationRole;
    }

    private PartnerRegionInfoResponse() {}

    private PartnerRegionInfoResponse(PartnerRegionInfoResponse $) {
        this.location = $.location;
        this.replicationRole = $.replicationRole;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PartnerRegionInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PartnerRegionInfoResponse $;

        public Builder() {
            $ = new PartnerRegionInfoResponse();
        }

        public Builder(PartnerRegionInfoResponse defaults) {
            $ = new PartnerRegionInfoResponse(Objects.requireNonNull(defaults));
        }

        public Builder location(@Nullable String location) {
            $.location = location;
            return this;
        }

        public Builder replicationRole(String replicationRole) {
            $.replicationRole = replicationRole;
            return this;
        }

        public PartnerRegionInfoResponse build() {
            $.replicationRole = Objects.requireNonNull($.replicationRole, "expected parameter 'replicationRole' to be non-null");
            return $;
        }
    }

}

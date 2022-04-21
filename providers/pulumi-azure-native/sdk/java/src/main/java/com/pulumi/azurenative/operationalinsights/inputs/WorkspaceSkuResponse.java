// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.operationalinsights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The SKU (tier) of a workspace.
 * 
 */
public final class WorkspaceSkuResponse extends com.pulumi.resources.InvokeArgs {

    public static final WorkspaceSkuResponse Empty = new WorkspaceSkuResponse();

    /**
     * The capacity reservation level for this workspace, when CapacityReservation sku is selected.
     * 
     */
    @Import(name="capacityReservationLevel")
    private @Nullable Integer capacityReservationLevel;

    public Optional<Integer> capacityReservationLevel() {
        return Optional.ofNullable(this.capacityReservationLevel);
    }

    /**
     * The last time when the sku was updated.
     * 
     */
    @Import(name="lastSkuUpdate", required=true)
    private String lastSkuUpdate;

    public String lastSkuUpdate() {
        return this.lastSkuUpdate;
    }

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    private WorkspaceSkuResponse() {}

    private WorkspaceSkuResponse(WorkspaceSkuResponse $) {
        this.capacityReservationLevel = $.capacityReservationLevel;
        this.lastSkuUpdate = $.lastSkuUpdate;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkspaceSkuResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkspaceSkuResponse $;

        public Builder() {
            $ = new WorkspaceSkuResponse();
        }

        public Builder(WorkspaceSkuResponse defaults) {
            $ = new WorkspaceSkuResponse(Objects.requireNonNull(defaults));
        }

        public Builder capacityReservationLevel(@Nullable Integer capacityReservationLevel) {
            $.capacityReservationLevel = capacityReservationLevel;
            return this;
        }

        public Builder lastSkuUpdate(String lastSkuUpdate) {
            $.lastSkuUpdate = lastSkuUpdate;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public WorkspaceSkuResponse build() {
            $.lastSkuUpdate = Objects.requireNonNull($.lastSkuUpdate, "expected parameter 'lastSkuUpdate' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}

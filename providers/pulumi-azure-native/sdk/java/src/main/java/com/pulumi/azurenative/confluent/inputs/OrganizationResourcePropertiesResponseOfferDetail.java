// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confluent.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Confluent offer detail
 * 
 */
public final class OrganizationResourcePropertiesResponseOfferDetail extends com.pulumi.resources.InvokeArgs {

    public static final OrganizationResourcePropertiesResponseOfferDetail Empty = new OrganizationResourcePropertiesResponseOfferDetail();

    /**
     * Offer Id
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * Offer Plan Id
     * 
     */
    @Import(name="planId")
    private @Nullable String planId;

    public Optional<String> planId() {
        return Optional.ofNullable(this.planId);
    }

    /**
     * Offer Plan Name
     * 
     */
    @Import(name="planName")
    private @Nullable String planName;

    public Optional<String> planName() {
        return Optional.ofNullable(this.planName);
    }

    /**
     * Publisher Id
     * 
     */
    @Import(name="publisherId")
    private @Nullable String publisherId;

    public Optional<String> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }

    /**
     * SaaS Offer Status
     * 
     */
    @Import(name="status", required=true)
    private String status;

    public String status() {
        return this.status;
    }

    /**
     * Offer Plan Term unit
     * 
     */
    @Import(name="termUnit")
    private @Nullable String termUnit;

    public Optional<String> termUnit() {
        return Optional.ofNullable(this.termUnit);
    }

    private OrganizationResourcePropertiesResponseOfferDetail() {}

    private OrganizationResourcePropertiesResponseOfferDetail(OrganizationResourcePropertiesResponseOfferDetail $) {
        this.id = $.id;
        this.planId = $.planId;
        this.planName = $.planName;
        this.publisherId = $.publisherId;
        this.status = $.status;
        this.termUnit = $.termUnit;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OrganizationResourcePropertiesResponseOfferDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OrganizationResourcePropertiesResponseOfferDetail $;

        public Builder() {
            $ = new OrganizationResourcePropertiesResponseOfferDetail();
        }

        public Builder(OrganizationResourcePropertiesResponseOfferDetail defaults) {
            $ = new OrganizationResourcePropertiesResponseOfferDetail(Objects.requireNonNull(defaults));
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder planId(@Nullable String planId) {
            $.planId = planId;
            return this;
        }

        public Builder planName(@Nullable String planName) {
            $.planName = planName;
            return this;
        }

        public Builder publisherId(@Nullable String publisherId) {
            $.publisherId = publisherId;
            return this;
        }

        public Builder status(String status) {
            $.status = status;
            return this;
        }

        public Builder termUnit(@Nullable String termUnit) {
            $.termUnit = termUnit;
            return this;
        }

        public OrganizationResourcePropertiesResponseOfferDetail build() {
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confluent.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OrganizationResourcePropertiesResponseOfferDetail {
    /**
     * Offer Id
     * 
     */
    private final @Nullable String id;
    /**
     * Offer Plan Id
     * 
     */
    private final @Nullable String planId;
    /**
     * Offer Plan Name
     * 
     */
    private final @Nullable String planName;
    /**
     * Publisher Id
     * 
     */
    private final @Nullable String publisherId;
    /**
     * SaaS Offer Status
     * 
     */
    private final String status;
    /**
     * Offer Plan Term unit
     * 
     */
    private final @Nullable String termUnit;

    @CustomType.Constructor
    private OrganizationResourcePropertiesResponseOfferDetail(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("planId") @Nullable String planId,
        @CustomType.Parameter("planName") @Nullable String planName,
        @CustomType.Parameter("publisherId") @Nullable String publisherId,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("termUnit") @Nullable String termUnit) {
        this.id = id;
        this.planId = planId;
        this.planName = planName;
        this.publisherId = publisherId;
        this.status = status;
        this.termUnit = termUnit;
    }

    /**
     * Offer Id
     * 
    */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Offer Plan Id
     * 
    */
    public Optional<String> planId() {
        return Optional.ofNullable(this.planId);
    }
    /**
     * Offer Plan Name
     * 
    */
    public Optional<String> planName() {
        return Optional.ofNullable(this.planName);
    }
    /**
     * Publisher Id
     * 
    */
    public Optional<String> publisherId() {
        return Optional.ofNullable(this.publisherId);
    }
    /**
     * SaaS Offer Status
     * 
    */
    public String status() {
        return this.status;
    }
    /**
     * Offer Plan Term unit
     * 
    */
    public Optional<String> termUnit() {
        return Optional.ofNullable(this.termUnit);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationResourcePropertiesResponseOfferDetail defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String planId;
        private @Nullable String planName;
        private @Nullable String publisherId;
        private String status;
        private @Nullable String termUnit;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationResourcePropertiesResponseOfferDetail defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.planId = defaults.planId;
    	      this.planName = defaults.planName;
    	      this.publisherId = defaults.publisherId;
    	      this.status = defaults.status;
    	      this.termUnit = defaults.termUnit;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder planId(@Nullable String planId) {
            this.planId = planId;
            return this;
        }
        public Builder planName(@Nullable String planName) {
            this.planName = planName;
            return this;
        }
        public Builder publisherId(@Nullable String publisherId) {
            this.publisherId = publisherId;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder termUnit(@Nullable String termUnit) {
            this.termUnit = termUnit;
            return this;
        }        public OrganizationResourcePropertiesResponseOfferDetail build() {
            return new OrganizationResourcePropertiesResponseOfferDetail(id, planId, planName, publisherId, status, termUnit);
        }
    }
}

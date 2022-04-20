// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.domainregistration.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Domain purchase consent object, representing acceptance of applicable legal agreements.
 * 
 */
public final class DomainPurchaseConsentArgs extends com.pulumi.resources.ResourceArgs {

    public static final DomainPurchaseConsentArgs Empty = new DomainPurchaseConsentArgs();

    /**
     * Timestamp when the agreements were accepted.
     * 
     */
    @Import(name="agreedAt")
      private final @Nullable Output<String> agreedAt;

    public Output<String> agreedAt() {
        return this.agreedAt == null ? Codegen.empty() : this.agreedAt;
    }

    /**
     * Client IP address.
     * 
     */
    @Import(name="agreedBy")
      private final @Nullable Output<String> agreedBy;

    public Output<String> agreedBy() {
        return this.agreedBy == null ? Codegen.empty() : this.agreedBy;
    }

    /**
     * List of applicable legal agreement keys. This list can be retrieved using ListLegalAgreements API under &lt;code&gt;TopLevelDomain&lt;/code&gt; resource.
     * 
     */
    @Import(name="agreementKeys")
      private final @Nullable Output<List<String>> agreementKeys;

    public Output<List<String>> agreementKeys() {
        return this.agreementKeys == null ? Codegen.empty() : this.agreementKeys;
    }

    public DomainPurchaseConsentArgs(
        @Nullable Output<String> agreedAt,
        @Nullable Output<String> agreedBy,
        @Nullable Output<List<String>> agreementKeys) {
        this.agreedAt = agreedAt;
        this.agreedBy = agreedBy;
        this.agreementKeys = agreementKeys;
    }

    private DomainPurchaseConsentArgs() {
        this.agreedAt = Codegen.empty();
        this.agreedBy = Codegen.empty();
        this.agreementKeys = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainPurchaseConsentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> agreedAt;
        private @Nullable Output<String> agreedBy;
        private @Nullable Output<List<String>> agreementKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainPurchaseConsentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreedAt = defaults.agreedAt;
    	      this.agreedBy = defaults.agreedBy;
    	      this.agreementKeys = defaults.agreementKeys;
        }

        public Builder agreedAt(@Nullable Output<String> agreedAt) {
            this.agreedAt = agreedAt;
            return this;
        }
        public Builder agreedAt(@Nullable String agreedAt) {
            this.agreedAt = Codegen.ofNullable(agreedAt);
            return this;
        }
        public Builder agreedBy(@Nullable Output<String> agreedBy) {
            this.agreedBy = agreedBy;
            return this;
        }
        public Builder agreedBy(@Nullable String agreedBy) {
            this.agreedBy = Codegen.ofNullable(agreedBy);
            return this;
        }
        public Builder agreementKeys(@Nullable Output<List<String>> agreementKeys) {
            this.agreementKeys = agreementKeys;
            return this;
        }
        public Builder agreementKeys(@Nullable List<String> agreementKeys) {
            this.agreementKeys = Codegen.ofNullable(agreementKeys);
            return this;
        }
        public Builder agreementKeys(String... agreementKeys) {
            return agreementKeys(List.of(agreementKeys));
        }        public DomainPurchaseConsentArgs build() {
            return new DomainPurchaseConsentArgs(agreedAt, agreedBy, agreementKeys);
        }
    }
}

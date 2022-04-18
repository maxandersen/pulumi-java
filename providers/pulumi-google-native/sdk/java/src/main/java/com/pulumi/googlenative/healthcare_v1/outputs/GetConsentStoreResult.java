// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.healthcare_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetConsentStoreResult {
    /**
     * Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * 
     */
    private final String defaultConsentTtl;
    /**
     * Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
     * 
     */
    private final Boolean enableConsentCreateOnUpdate;
    /**
     * Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
     * 
     */
    private final Map<String,String> labels;
    /**
     * Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private GetConsentStoreResult(
        @CustomType.Parameter("defaultConsentTtl") String defaultConsentTtl,
        @CustomType.Parameter("enableConsentCreateOnUpdate") Boolean enableConsentCreateOnUpdate,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name) {
        this.defaultConsentTtl = defaultConsentTtl;
        this.enableConsentCreateOnUpdate = enableConsentCreateOnUpdate;
        this.labels = labels;
        this.name = name;
    }

    /**
     * Optional. Default time to live for Consents created in this store. Must be at least 24 hours. Updating this field will not affect the expiration time of existing consents.
     * 
    */
    public String defaultConsentTtl() {
        return this.defaultConsentTtl;
    }
    /**
     * Optional. If `true`, UpdateConsent creates the Consent if it does not already exist. If unspecified, defaults to `false`.
     * 
    */
    public Boolean enableConsentCreateOnUpdate() {
        return this.enableConsentCreateOnUpdate;
    }
    /**
     * Optional. User-supplied key-value pairs used to organize consent stores. Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: \p{Ll}\p{Lo}{0,62}. Label values must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}. No more than 64 labels can be associated with a given store. For more information: https://cloud.google.com/healthcare/docs/how-tos/labeling-resources
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     * Resource name of the consent store, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}`. Cannot be changed after creation.
     * 
    */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsentStoreResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String defaultConsentTtl;
        private Boolean enableConsentCreateOnUpdate;
        private Map<String,String> labels;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsentStoreResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultConsentTtl = defaults.defaultConsentTtl;
    	      this.enableConsentCreateOnUpdate = defaults.enableConsentCreateOnUpdate;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder defaultConsentTtl(String defaultConsentTtl) {
            this.defaultConsentTtl = Objects.requireNonNull(defaultConsentTtl);
            return this;
        }
        public Builder enableConsentCreateOnUpdate(Boolean enableConsentCreateOnUpdate) {
            this.enableConsentCreateOnUpdate = Objects.requireNonNull(enableConsentCreateOnUpdate);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public GetConsentStoreResult build() {
            return new GetConsentStoreResult(defaultConsentTtl, enableConsentCreateOnUpdate, labels, name);
        }
    }
}

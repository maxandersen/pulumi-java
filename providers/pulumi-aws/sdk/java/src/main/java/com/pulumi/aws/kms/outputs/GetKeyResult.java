// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.outputs;

import com.pulumi.aws.kms.outputs.GetKeyMultiRegionConfiguration;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetKeyResult {
    private final String arn;
    private final String awsAccountId;
    private final String creationDate;
    private final String customerMasterKeySpec;
    private final String deletionDate;
    private final String description;
    private final Boolean enabled;
    private final String expirationModel;
    private final @Nullable List<String> grantTokens;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String keyId;
    private final String keyManager;
    private final String keyState;
    private final String keyUsage;
    private final Boolean multiRegion;
    private final List<GetKeyMultiRegionConfiguration> multiRegionConfigurations;
    private final String origin;
    private final String validTo;

    @CustomType.Constructor
    private GetKeyResult(
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("awsAccountId") String awsAccountId,
        @CustomType.Parameter("creationDate") String creationDate,
        @CustomType.Parameter("customerMasterKeySpec") String customerMasterKeySpec,
        @CustomType.Parameter("deletionDate") String deletionDate,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("enabled") Boolean enabled,
        @CustomType.Parameter("expirationModel") String expirationModel,
        @CustomType.Parameter("grantTokens") @Nullable List<String> grantTokens,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("keyId") String keyId,
        @CustomType.Parameter("keyManager") String keyManager,
        @CustomType.Parameter("keyState") String keyState,
        @CustomType.Parameter("keyUsage") String keyUsage,
        @CustomType.Parameter("multiRegion") Boolean multiRegion,
        @CustomType.Parameter("multiRegionConfigurations") List<GetKeyMultiRegionConfiguration> multiRegionConfigurations,
        @CustomType.Parameter("origin") String origin,
        @CustomType.Parameter("validTo") String validTo) {
        this.arn = arn;
        this.awsAccountId = awsAccountId;
        this.creationDate = creationDate;
        this.customerMasterKeySpec = customerMasterKeySpec;
        this.deletionDate = deletionDate;
        this.description = description;
        this.enabled = enabled;
        this.expirationModel = expirationModel;
        this.grantTokens = grantTokens;
        this.id = id;
        this.keyId = keyId;
        this.keyManager = keyManager;
        this.keyState = keyState;
        this.keyUsage = keyUsage;
        this.multiRegion = multiRegion;
        this.multiRegionConfigurations = multiRegionConfigurations;
        this.origin = origin;
        this.validTo = validTo;
    }

    public String arn() {
        return this.arn;
    }
    public String awsAccountId() {
        return this.awsAccountId;
    }
    public String creationDate() {
        return this.creationDate;
    }
    public String customerMasterKeySpec() {
        return this.customerMasterKeySpec;
    }
    public String deletionDate() {
        return this.deletionDate;
    }
    public String description() {
        return this.description;
    }
    public Boolean enabled() {
        return this.enabled;
    }
    public String expirationModel() {
        return this.expirationModel;
    }
    public List<String> grantTokens() {
        return this.grantTokens == null ? List.of() : this.grantTokens;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public String keyId() {
        return this.keyId;
    }
    public String keyManager() {
        return this.keyManager;
    }
    public String keyState() {
        return this.keyState;
    }
    public String keyUsage() {
        return this.keyUsage;
    }
    public Boolean multiRegion() {
        return this.multiRegion;
    }
    public List<GetKeyMultiRegionConfiguration> multiRegionConfigurations() {
        return this.multiRegionConfigurations;
    }
    public String origin() {
        return this.origin;
    }
    public String validTo() {
        return this.validTo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetKeyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String awsAccountId;
        private String creationDate;
        private String customerMasterKeySpec;
        private String deletionDate;
        private String description;
        private Boolean enabled;
        private String expirationModel;
        private @Nullable List<String> grantTokens;
        private String id;
        private String keyId;
        private String keyManager;
        private String keyState;
        private String keyUsage;
        private Boolean multiRegion;
        private List<GetKeyMultiRegionConfiguration> multiRegionConfigurations;
        private String origin;
        private String validTo;

        public Builder() {
    	      // Empty
        }

        public Builder(GetKeyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.creationDate = defaults.creationDate;
    	      this.customerMasterKeySpec = defaults.customerMasterKeySpec;
    	      this.deletionDate = defaults.deletionDate;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.expirationModel = defaults.expirationModel;
    	      this.grantTokens = defaults.grantTokens;
    	      this.id = defaults.id;
    	      this.keyId = defaults.keyId;
    	      this.keyManager = defaults.keyManager;
    	      this.keyState = defaults.keyState;
    	      this.keyUsage = defaults.keyUsage;
    	      this.multiRegion = defaults.multiRegion;
    	      this.multiRegionConfigurations = defaults.multiRegionConfigurations;
    	      this.origin = defaults.origin;
    	      this.validTo = defaults.validTo;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }
        public Builder creationDate(String creationDate) {
            this.creationDate = Objects.requireNonNull(creationDate);
            return this;
        }
        public Builder customerMasterKeySpec(String customerMasterKeySpec) {
            this.customerMasterKeySpec = Objects.requireNonNull(customerMasterKeySpec);
            return this;
        }
        public Builder deletionDate(String deletionDate) {
            this.deletionDate = Objects.requireNonNull(deletionDate);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder expirationModel(String expirationModel) {
            this.expirationModel = Objects.requireNonNull(expirationModel);
            return this;
        }
        public Builder grantTokens(@Nullable List<String> grantTokens) {
            this.grantTokens = grantTokens;
            return this;
        }
        public Builder grantTokens(String... grantTokens) {
            return grantTokens(List.of(grantTokens));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder keyId(String keyId) {
            this.keyId = Objects.requireNonNull(keyId);
            return this;
        }
        public Builder keyManager(String keyManager) {
            this.keyManager = Objects.requireNonNull(keyManager);
            return this;
        }
        public Builder keyState(String keyState) {
            this.keyState = Objects.requireNonNull(keyState);
            return this;
        }
        public Builder keyUsage(String keyUsage) {
            this.keyUsage = Objects.requireNonNull(keyUsage);
            return this;
        }
        public Builder multiRegion(Boolean multiRegion) {
            this.multiRegion = Objects.requireNonNull(multiRegion);
            return this;
        }
        public Builder multiRegionConfigurations(List<GetKeyMultiRegionConfiguration> multiRegionConfigurations) {
            this.multiRegionConfigurations = Objects.requireNonNull(multiRegionConfigurations);
            return this;
        }
        public Builder multiRegionConfigurations(GetKeyMultiRegionConfiguration... multiRegionConfigurations) {
            return multiRegionConfigurations(List.of(multiRegionConfigurations));
        }
        public Builder origin(String origin) {
            this.origin = Objects.requireNonNull(origin);
            return this;
        }
        public Builder validTo(String validTo) {
            this.validTo = Objects.requireNonNull(validTo);
            return this;
        }        public GetKeyResult build() {
            return new GetKeyResult(arn, awsAccountId, creationDate, customerMasterKeySpec, deletionDate, description, enabled, expirationModel, grantTokens, id, keyId, keyManager, keyState, keyUsage, multiRegion, multiRegionConfigurations, origin, validTo);
        }
    }
}

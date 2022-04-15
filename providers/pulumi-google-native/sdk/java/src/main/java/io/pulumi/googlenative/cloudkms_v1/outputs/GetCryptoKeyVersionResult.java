// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudkms_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudkms_v1.outputs.ExternalProtectionLevelOptionsResponse;
import io.pulumi.googlenative.cloudkms_v1.outputs.KeyOperationAttestationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCryptoKeyVersionResult {
    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    private final String algorithm;
    /**
     * Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
     */
    private final KeyOperationAttestationResponse attestation;
    /**
     * The time at which this CryptoKeyVersion was created.
     * 
     */
    private final String createTime;
    /**
     * The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
     * 
     */
    private final String destroyEventTime;
    /**
     * The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
     */
    private final String destroyTime;
    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    private final ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions;
    /**
     * The time this CryptoKeyVersion's key material was generated.
     * 
     */
    private final String generateTime;
    /**
     * The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
     */
    private final String importFailureReason;
    /**
     * The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
     */
    private final String importJob;
    /**
     * The time at which this CryptoKeyVersion's key material was most recently imported.
     * 
     */
    private final String importTime;
    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    private final String name;
    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
     */
    private final String protectionLevel;
    /**
     * Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
     */
    private final Boolean reimportEligible;
    /**
     * The current state of the CryptoKeyVersion.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetCryptoKeyVersionResult(
        @CustomType.Parameter("algorithm") String algorithm,
        @CustomType.Parameter("attestation") KeyOperationAttestationResponse attestation,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("destroyEventTime") String destroyEventTime,
        @CustomType.Parameter("destroyTime") String destroyTime,
        @CustomType.Parameter("externalProtectionLevelOptions") ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions,
        @CustomType.Parameter("generateTime") String generateTime,
        @CustomType.Parameter("importFailureReason") String importFailureReason,
        @CustomType.Parameter("importJob") String importJob,
        @CustomType.Parameter("importTime") String importTime,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("protectionLevel") String protectionLevel,
        @CustomType.Parameter("reimportEligible") Boolean reimportEligible,
        @CustomType.Parameter("state") String state) {
        this.algorithm = algorithm;
        this.attestation = attestation;
        this.createTime = createTime;
        this.destroyEventTime = destroyEventTime;
        this.destroyTime = destroyTime;
        this.externalProtectionLevelOptions = externalProtectionLevelOptions;
        this.generateTime = generateTime;
        this.importFailureReason = importFailureReason;
        this.importJob = importJob;
        this.importTime = importTime;
        this.name = name;
        this.protectionLevel = protectionLevel;
        this.reimportEligible = reimportEligible;
        this.state = state;
    }

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
    */
    public String algorithm() {
        return this.algorithm;
    }
    /**
     * Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
    */
    public KeyOperationAttestationResponse attestation() {
        return this.attestation;
    }
    /**
     * The time at which this CryptoKeyVersion was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * The time this CryptoKeyVersion's key material was destroyed. Only present if state is DESTROYED.
     * 
    */
    public String destroyEventTime() {
        return this.destroyEventTime;
    }
    /**
     * The time this CryptoKeyVersion's key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
    */
    public String destroyTime() {
        return this.destroyTime;
    }
    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
    */
    public ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions() {
        return this.externalProtectionLevelOptions;
    }
    /**
     * The time this CryptoKeyVersion's key material was generated.
     * 
    */
    public String generateTime() {
        return this.generateTime;
    }
    /**
     * The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
    */
    public String importFailureReason() {
        return this.importFailureReason;
    }
    /**
     * The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
    */
    public String importJob() {
        return this.importJob;
    }
    /**
     * The time at which this CryptoKeyVersion's key material was most recently imported.
     * 
    */
    public String importTime() {
        return this.importTime;
    }
    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
    */
    public String protectionLevel() {
        return this.protectionLevel;
    }
    /**
     * Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
    */
    public Boolean reimportEligible() {
        return this.reimportEligible;
    }
    /**
     * The current state of the CryptoKeyVersion.
     * 
    */
    public String state() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCryptoKeyVersionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String algorithm;
        private KeyOperationAttestationResponse attestation;
        private String createTime;
        private String destroyEventTime;
        private String destroyTime;
        private ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions;
        private String generateTime;
        private String importFailureReason;
        private String importJob;
        private String importTime;
        private String name;
        private String protectionLevel;
        private Boolean reimportEligible;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCryptoKeyVersionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.algorithm = defaults.algorithm;
    	      this.attestation = defaults.attestation;
    	      this.createTime = defaults.createTime;
    	      this.destroyEventTime = defaults.destroyEventTime;
    	      this.destroyTime = defaults.destroyTime;
    	      this.externalProtectionLevelOptions = defaults.externalProtectionLevelOptions;
    	      this.generateTime = defaults.generateTime;
    	      this.importFailureReason = defaults.importFailureReason;
    	      this.importJob = defaults.importJob;
    	      this.importTime = defaults.importTime;
    	      this.name = defaults.name;
    	      this.protectionLevel = defaults.protectionLevel;
    	      this.reimportEligible = defaults.reimportEligible;
    	      this.state = defaults.state;
        }

        public Builder algorithm(String algorithm) {
            this.algorithm = Objects.requireNonNull(algorithm);
            return this;
        }
        public Builder attestation(KeyOperationAttestationResponse attestation) {
            this.attestation = Objects.requireNonNull(attestation);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder destroyEventTime(String destroyEventTime) {
            this.destroyEventTime = Objects.requireNonNull(destroyEventTime);
            return this;
        }
        public Builder destroyTime(String destroyTime) {
            this.destroyTime = Objects.requireNonNull(destroyTime);
            return this;
        }
        public Builder externalProtectionLevelOptions(ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions) {
            this.externalProtectionLevelOptions = Objects.requireNonNull(externalProtectionLevelOptions);
            return this;
        }
        public Builder generateTime(String generateTime) {
            this.generateTime = Objects.requireNonNull(generateTime);
            return this;
        }
        public Builder importFailureReason(String importFailureReason) {
            this.importFailureReason = Objects.requireNonNull(importFailureReason);
            return this;
        }
        public Builder importJob(String importJob) {
            this.importJob = Objects.requireNonNull(importJob);
            return this;
        }
        public Builder importTime(String importTime) {
            this.importTime = Objects.requireNonNull(importTime);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder protectionLevel(String protectionLevel) {
            this.protectionLevel = Objects.requireNonNull(protectionLevel);
            return this;
        }
        public Builder reimportEligible(Boolean reimportEligible) {
            this.reimportEligible = Objects.requireNonNull(reimportEligible);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetCryptoKeyVersionResult build() {
            return new GetCryptoKeyVersionResult(algorithm, attestation, createTime, destroyEventTime, destroyTime, externalProtectionLevelOptions, generateTime, importFailureReason, importJob, importTime, name, protectionLevel, reimportEligible, state);
        }
    }
}

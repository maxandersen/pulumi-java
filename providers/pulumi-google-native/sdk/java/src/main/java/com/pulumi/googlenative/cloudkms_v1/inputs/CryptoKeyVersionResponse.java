// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.cloudkms_v1.inputs.ExternalProtectionLevelOptionsResponse;
import com.pulumi.googlenative.cloudkms_v1.inputs.KeyOperationAttestationResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * A CryptoKeyVersion represents an individual cryptographic key, and the associated key material. An ENABLED version can be used for cryptographic operations. For security reasons, the raw cryptographic key material represented by a CryptoKeyVersion can never be viewed or exported. It can only be used to encrypt, decrypt, or sign data when an authorized user or application invokes Cloud KMS.
 * 
 */
public final class CryptoKeyVersionResponse extends com.pulumi.resources.InvokeArgs {

    public static final CryptoKeyVersionResponse Empty = new CryptoKeyVersionResponse();

    /**
     * The CryptoKeyVersionAlgorithm that this CryptoKeyVersion supports.
     * 
     */
    @Import(name="algorithm", required=true)
    private String algorithm;

    public String algorithm() {
        return this.algorithm;
    }

    /**
     * Statement that was generated and signed by the HSM at key creation time. Use this statement to verify attributes of the key as stored on the HSM, independently of Google. Only provided for key versions with protection_level HSM.
     * 
     */
    @Import(name="attestation", required=true)
    private KeyOperationAttestationResponse attestation;

    public KeyOperationAttestationResponse attestation() {
        return this.attestation;
    }

    /**
     * The time at which this CryptoKeyVersion was created.
     * 
     */
    @Import(name="createTime", required=true)
    private String createTime;

    public String createTime() {
        return this.createTime;
    }

    /**
     * The time this CryptoKeyVersion&#39;s key material was destroyed. Only present if state is DESTROYED.
     * 
     */
    @Import(name="destroyEventTime", required=true)
    private String destroyEventTime;

    public String destroyEventTime() {
        return this.destroyEventTime;
    }

    /**
     * The time this CryptoKeyVersion&#39;s key material is scheduled for destruction. Only present if state is DESTROY_SCHEDULED.
     * 
     */
    @Import(name="destroyTime", required=true)
    private String destroyTime;

    public String destroyTime() {
        return this.destroyTime;
    }

    /**
     * ExternalProtectionLevelOptions stores a group of additional fields for configuring a CryptoKeyVersion that are specific to the EXTERNAL protection level and EXTERNAL_VPC protection levels.
     * 
     */
    @Import(name="externalProtectionLevelOptions", required=true)
    private ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions;

    public ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions() {
        return this.externalProtectionLevelOptions;
    }

    /**
     * The time this CryptoKeyVersion&#39;s key material was generated.
     * 
     */
    @Import(name="generateTime", required=true)
    private String generateTime;

    public String generateTime() {
        return this.generateTime;
    }

    /**
     * The root cause of the most recent import failure. Only present if state is IMPORT_FAILED.
     * 
     */
    @Import(name="importFailureReason", required=true)
    private String importFailureReason;

    public String importFailureReason() {
        return this.importFailureReason;
    }

    /**
     * The name of the ImportJob used in the most recent import of this CryptoKeyVersion. Only present if the underlying key material was imported.
     * 
     */
    @Import(name="importJob", required=true)
    private String importJob;

    public String importJob() {
        return this.importJob;
    }

    /**
     * The time at which this CryptoKeyVersion&#39;s key material was most recently imported.
     * 
     */
    @Import(name="importTime", required=true)
    private String importTime;

    public String importTime() {
        return this.importTime;
    }

    /**
     * The resource name for this CryptoKeyVersion in the format `projects/*{@literal /}locations/*{@literal /}keyRings/*{@literal /}cryptoKeys/*{@literal /}cryptoKeyVersions/*`.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * The ProtectionLevel describing how crypto operations are performed with this CryptoKeyVersion.
     * 
     */
    @Import(name="protectionLevel", required=true)
    private String protectionLevel;

    public String protectionLevel() {
        return this.protectionLevel;
    }

    /**
     * Whether or not this key version is eligible for reimport, by being specified as a target in ImportCryptoKeyVersionRequest.crypto_key_version.
     * 
     */
    @Import(name="reimportEligible", required=true)
    private Boolean reimportEligible;

    public Boolean reimportEligible() {
        return this.reimportEligible;
    }

    /**
     * The current state of the CryptoKeyVersion.
     * 
     */
    @Import(name="state", required=true)
    private String state;

    public String state() {
        return this.state;
    }

    private CryptoKeyVersionResponse() {}

    private CryptoKeyVersionResponse(CryptoKeyVersionResponse $) {
        this.algorithm = $.algorithm;
        this.attestation = $.attestation;
        this.createTime = $.createTime;
        this.destroyEventTime = $.destroyEventTime;
        this.destroyTime = $.destroyTime;
        this.externalProtectionLevelOptions = $.externalProtectionLevelOptions;
        this.generateTime = $.generateTime;
        this.importFailureReason = $.importFailureReason;
        this.importJob = $.importJob;
        this.importTime = $.importTime;
        this.name = $.name;
        this.protectionLevel = $.protectionLevel;
        this.reimportEligible = $.reimportEligible;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CryptoKeyVersionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CryptoKeyVersionResponse $;

        public Builder() {
            $ = new CryptoKeyVersionResponse();
        }

        public Builder(CryptoKeyVersionResponse defaults) {
            $ = new CryptoKeyVersionResponse(Objects.requireNonNull(defaults));
        }

        public Builder algorithm(String algorithm) {
            $.algorithm = algorithm;
            return this;
        }

        public Builder attestation(KeyOperationAttestationResponse attestation) {
            $.attestation = attestation;
            return this;
        }

        public Builder createTime(String createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder destroyEventTime(String destroyEventTime) {
            $.destroyEventTime = destroyEventTime;
            return this;
        }

        public Builder destroyTime(String destroyTime) {
            $.destroyTime = destroyTime;
            return this;
        }

        public Builder externalProtectionLevelOptions(ExternalProtectionLevelOptionsResponse externalProtectionLevelOptions) {
            $.externalProtectionLevelOptions = externalProtectionLevelOptions;
            return this;
        }

        public Builder generateTime(String generateTime) {
            $.generateTime = generateTime;
            return this;
        }

        public Builder importFailureReason(String importFailureReason) {
            $.importFailureReason = importFailureReason;
            return this;
        }

        public Builder importJob(String importJob) {
            $.importJob = importJob;
            return this;
        }

        public Builder importTime(String importTime) {
            $.importTime = importTime;
            return this;
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder protectionLevel(String protectionLevel) {
            $.protectionLevel = protectionLevel;
            return this;
        }

        public Builder reimportEligible(Boolean reimportEligible) {
            $.reimportEligible = reimportEligible;
            return this;
        }

        public Builder state(String state) {
            $.state = state;
            return this;
        }

        public CryptoKeyVersionResponse build() {
            $.algorithm = Objects.requireNonNull($.algorithm, "expected parameter 'algorithm' to be non-null");
            $.attestation = Objects.requireNonNull($.attestation, "expected parameter 'attestation' to be non-null");
            $.createTime = Objects.requireNonNull($.createTime, "expected parameter 'createTime' to be non-null");
            $.destroyEventTime = Objects.requireNonNull($.destroyEventTime, "expected parameter 'destroyEventTime' to be non-null");
            $.destroyTime = Objects.requireNonNull($.destroyTime, "expected parameter 'destroyTime' to be non-null");
            $.externalProtectionLevelOptions = Objects.requireNonNull($.externalProtectionLevelOptions, "expected parameter 'externalProtectionLevelOptions' to be non-null");
            $.generateTime = Objects.requireNonNull($.generateTime, "expected parameter 'generateTime' to be non-null");
            $.importFailureReason = Objects.requireNonNull($.importFailureReason, "expected parameter 'importFailureReason' to be non-null");
            $.importJob = Objects.requireNonNull($.importJob, "expected parameter 'importJob' to be non-null");
            $.importTime = Objects.requireNonNull($.importTime, "expected parameter 'importTime' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.protectionLevel = Objects.requireNonNull($.protectionLevel, "expected parameter 'protectionLevel' to be non-null");
            $.reimportEligible = Objects.requireNonNull($.reimportEligible, "expected parameter 'reimportEligible' to be non-null");
            $.state = Objects.requireNonNull($.state, "expected parameter 'state' to be non-null");
            return $;
        }
    }

}

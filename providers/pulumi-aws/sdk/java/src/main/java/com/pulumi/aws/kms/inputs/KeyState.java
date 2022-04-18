// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyState extends com.pulumi.resources.ResourceArgs {

    public static final KeyState Empty = new KeyState();

    /**
     * The Amazon Resource Name (ARN) of the key.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @Import(name="bypassPolicyLockoutSafetyCheck")
      private final @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;

    public Output<Boolean> bypassPolicyLockoutSafetyCheck() {
        return this.bypassPolicyLockoutSafetyCheck == null ? Codegen.empty() : this.bypassPolicyLockoutSafetyCheck;
    }

    /**
     * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    @Import(name="customerMasterKeySpec")
      private final @Nullable Output<String> customerMasterKeySpec;

    public Output<String> customerMasterKeySpec() {
        return this.customerMasterKeySpec == null ? Codegen.empty() : this.customerMasterKeySpec;
    }

    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    @Import(name="deletionWindowInDays")
      private final @Nullable Output<Integer> deletionWindowInDays;

    public Output<Integer> deletionWindowInDays() {
        return this.deletionWindowInDays == null ? Codegen.empty() : this.deletionWindowInDays;
    }

    /**
     * The description of the key as viewed in AWS console.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to false.
     * 
     */
    @Import(name="enableKeyRotation")
      private final @Nullable Output<Boolean> enableKeyRotation;

    public Output<Boolean> enableKeyRotation() {
        return this.enableKeyRotation == null ? Codegen.empty() : this.enableKeyRotation;
    }

    /**
     * Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    @Import(name="isEnabled")
      private final @Nullable Output<Boolean> isEnabled;

    public Output<Boolean> isEnabled() {
        return this.isEnabled == null ? Codegen.empty() : this.isEnabled;
    }

    /**
     * The globally unique identifier for the key.
     * 
     */
    @Import(name="keyId")
      private final @Nullable Output<String> keyId;

    public Output<String> keyId() {
        return this.keyId == null ? Codegen.empty() : this.keyId;
    }

    /**
     * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT` or `SIGN_VERIFY`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    @Import(name="keyUsage")
      private final @Nullable Output<String> keyUsage;

    public Output<String> keyUsage() {
        return this.keyUsage == null ? Codegen.empty() : this.keyUsage;
    }

    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @Import(name="multiRegion")
      private final @Nullable Output<Boolean> multiRegion;

    public Output<Boolean> multiRegion() {
        return this.multiRegion == null ? Codegen.empty() : this.multiRegion;
    }

    /**
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     */
    @Import(name="policy")
      private final @Nullable Output<String> policy;

    public Output<String> policy() {
        return this.policy == null ? Codegen.empty() : this.policy;
    }

    /**
     * A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    public KeyState(
        @Nullable Output<String> arn,
        @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck,
        @Nullable Output<String> customerMasterKeySpec,
        @Nullable Output<Integer> deletionWindowInDays,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableKeyRotation,
        @Nullable Output<Boolean> isEnabled,
        @Nullable Output<String> keyId,
        @Nullable Output<String> keyUsage,
        @Nullable Output<Boolean> multiRegion,
        @Nullable Output<String> policy,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
        this.customerMasterKeySpec = customerMasterKeySpec;
        this.deletionWindowInDays = deletionWindowInDays;
        this.description = description;
        this.enableKeyRotation = enableKeyRotation;
        this.isEnabled = isEnabled;
        this.keyId = keyId;
        this.keyUsage = keyUsage;
        this.multiRegion = multiRegion;
        this.policy = policy;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private KeyState() {
        this.arn = Codegen.empty();
        this.bypassPolicyLockoutSafetyCheck = Codegen.empty();
        this.customerMasterKeySpec = Codegen.empty();
        this.deletionWindowInDays = Codegen.empty();
        this.description = Codegen.empty();
        this.enableKeyRotation = Codegen.empty();
        this.isEnabled = Codegen.empty();
        this.keyId = Codegen.empty();
        this.keyUsage = Codegen.empty();
        this.multiRegion = Codegen.empty();
        this.policy = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck;
        private @Nullable Output<String> customerMasterKeySpec;
        private @Nullable Output<Integer> deletionWindowInDays;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableKeyRotation;
        private @Nullable Output<Boolean> isEnabled;
        private @Nullable Output<String> keyId;
        private @Nullable Output<String> keyUsage;
        private @Nullable Output<Boolean> multiRegion;
        private @Nullable Output<String> policy;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.bypassPolicyLockoutSafetyCheck = defaults.bypassPolicyLockoutSafetyCheck;
    	      this.customerMasterKeySpec = defaults.customerMasterKeySpec;
    	      this.deletionWindowInDays = defaults.deletionWindowInDays;
    	      this.description = defaults.description;
    	      this.enableKeyRotation = defaults.enableKeyRotation;
    	      this.isEnabled = defaults.isEnabled;
    	      this.keyId = defaults.keyId;
    	      this.keyUsage = defaults.keyUsage;
    	      this.multiRegion = defaults.multiRegion;
    	      this.policy = defaults.policy;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Output<Boolean> bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = bypassPolicyLockoutSafetyCheck;
            return this;
        }
        public Builder bypassPolicyLockoutSafetyCheck(@Nullable Boolean bypassPolicyLockoutSafetyCheck) {
            this.bypassPolicyLockoutSafetyCheck = Codegen.ofNullable(bypassPolicyLockoutSafetyCheck);
            return this;
        }
        public Builder customerMasterKeySpec(@Nullable Output<String> customerMasterKeySpec) {
            this.customerMasterKeySpec = customerMasterKeySpec;
            return this;
        }
        public Builder customerMasterKeySpec(@Nullable String customerMasterKeySpec) {
            this.customerMasterKeySpec = Codegen.ofNullable(customerMasterKeySpec);
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Output<Integer> deletionWindowInDays) {
            this.deletionWindowInDays = deletionWindowInDays;
            return this;
        }
        public Builder deletionWindowInDays(@Nullable Integer deletionWindowInDays) {
            this.deletionWindowInDays = Codegen.ofNullable(deletionWindowInDays);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder enableKeyRotation(@Nullable Output<Boolean> enableKeyRotation) {
            this.enableKeyRotation = enableKeyRotation;
            return this;
        }
        public Builder enableKeyRotation(@Nullable Boolean enableKeyRotation) {
            this.enableKeyRotation = Codegen.ofNullable(enableKeyRotation);
            return this;
        }
        public Builder isEnabled(@Nullable Output<Boolean> isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }
        public Builder isEnabled(@Nullable Boolean isEnabled) {
            this.isEnabled = Codegen.ofNullable(isEnabled);
            return this;
        }
        public Builder keyId(@Nullable Output<String> keyId) {
            this.keyId = keyId;
            return this;
        }
        public Builder keyId(@Nullable String keyId) {
            this.keyId = Codegen.ofNullable(keyId);
            return this;
        }
        public Builder keyUsage(@Nullable Output<String> keyUsage) {
            this.keyUsage = keyUsage;
            return this;
        }
        public Builder keyUsage(@Nullable String keyUsage) {
            this.keyUsage = Codegen.ofNullable(keyUsage);
            return this;
        }
        public Builder multiRegion(@Nullable Output<Boolean> multiRegion) {
            this.multiRegion = multiRegion;
            return this;
        }
        public Builder multiRegion(@Nullable Boolean multiRegion) {
            this.multiRegion = Codegen.ofNullable(multiRegion);
            return this;
        }
        public Builder policy(@Nullable Output<String> policy) {
            this.policy = policy;
            return this;
        }
        public Builder policy(@Nullable String policy) {
            this.policy = Codegen.ofNullable(policy);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }        public KeyState build() {
            return new KeyState(arn, bypassPolicyLockoutSafetyCheck, customerMasterKeySpec, deletionWindowInDays, description, enableKeyRotation, isEnabled, keyId, keyUsage, multiRegion, policy, tags, tagsAll);
        }
    }
}

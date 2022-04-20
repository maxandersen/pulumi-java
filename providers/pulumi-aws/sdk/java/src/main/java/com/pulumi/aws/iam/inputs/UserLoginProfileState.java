// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserLoginProfileState extends com.pulumi.resources.ResourceArgs {

    public static final UserLoginProfileState Empty = new UserLoginProfileState();

    /**
     * The encrypted password, base64 encoded. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @Import(name="encryptedPassword")
      private final @Nullable Output<String> encryptedPassword;

    public Output<String> encryptedPassword() {
        return this.encryptedPassword == null ? Codegen.empty() : this.encryptedPassword;
    }

    /**
     * The fingerprint of the PGP key used to encrypt the password. Only available if password was handled on this provider resource creation, not import.
     * 
     */
    @Import(name="keyFingerprint")
      private final @Nullable Output<String> keyFingerprint;

    public Output<String> keyFingerprint() {
        return this.keyFingerprint == null ? Codegen.empty() : this.keyFingerprint;
    }

    /**
     * The length of the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Import(name="passwordLength")
      private final @Nullable Output<Integer> passwordLength;

    public Output<Integer> passwordLength() {
        return this.passwordLength == null ? Codegen.empty() : this.passwordLength;
    }

    /**
     * Whether the user should be forced to reset the generated password on resource creation. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Import(name="passwordResetRequired")
      private final @Nullable Output<Boolean> passwordResetRequired;

    public Output<Boolean> passwordResetRequired() {
        return this.passwordResetRequired == null ? Codegen.empty() : this.passwordResetRequired;
    }

    /**
     * Either a base-64 encoded PGP public key, or a keybase username in the form `keybase:username`. Only applies on resource creation. Drift detection is not possible with this argument.
     * 
     */
    @Import(name="pgpKey")
      private final @Nullable Output<String> pgpKey;

    public Output<String> pgpKey() {
        return this.pgpKey == null ? Codegen.empty() : this.pgpKey;
    }

    /**
     * The IAM user&#39;s name.
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> user() {
        return this.user == null ? Codegen.empty() : this.user;
    }

    public UserLoginProfileState(
        @Nullable Output<String> encryptedPassword,
        @Nullable Output<String> keyFingerprint,
        @Nullable Output<Integer> passwordLength,
        @Nullable Output<Boolean> passwordResetRequired,
        @Nullable Output<String> pgpKey,
        @Nullable Output<String> user) {
        this.encryptedPassword = encryptedPassword;
        this.keyFingerprint = keyFingerprint;
        this.passwordLength = passwordLength;
        this.passwordResetRequired = passwordResetRequired;
        this.pgpKey = pgpKey;
        this.user = user;
    }

    private UserLoginProfileState() {
        this.encryptedPassword = Codegen.empty();
        this.keyFingerprint = Codegen.empty();
        this.passwordLength = Codegen.empty();
        this.passwordResetRequired = Codegen.empty();
        this.pgpKey = Codegen.empty();
        this.user = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserLoginProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> encryptedPassword;
        private @Nullable Output<String> keyFingerprint;
        private @Nullable Output<Integer> passwordLength;
        private @Nullable Output<Boolean> passwordResetRequired;
        private @Nullable Output<String> pgpKey;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(UserLoginProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedPassword = defaults.encryptedPassword;
    	      this.keyFingerprint = defaults.keyFingerprint;
    	      this.passwordLength = defaults.passwordLength;
    	      this.passwordResetRequired = defaults.passwordResetRequired;
    	      this.pgpKey = defaults.pgpKey;
    	      this.user = defaults.user;
        }

        public Builder encryptedPassword(@Nullable Output<String> encryptedPassword) {
            this.encryptedPassword = encryptedPassword;
            return this;
        }
        public Builder encryptedPassword(@Nullable String encryptedPassword) {
            this.encryptedPassword = Codegen.ofNullable(encryptedPassword);
            return this;
        }
        public Builder keyFingerprint(@Nullable Output<String> keyFingerprint) {
            this.keyFingerprint = keyFingerprint;
            return this;
        }
        public Builder keyFingerprint(@Nullable String keyFingerprint) {
            this.keyFingerprint = Codegen.ofNullable(keyFingerprint);
            return this;
        }
        public Builder passwordLength(@Nullable Output<Integer> passwordLength) {
            this.passwordLength = passwordLength;
            return this;
        }
        public Builder passwordLength(@Nullable Integer passwordLength) {
            this.passwordLength = Codegen.ofNullable(passwordLength);
            return this;
        }
        public Builder passwordResetRequired(@Nullable Output<Boolean> passwordResetRequired) {
            this.passwordResetRequired = passwordResetRequired;
            return this;
        }
        public Builder passwordResetRequired(@Nullable Boolean passwordResetRequired) {
            this.passwordResetRequired = Codegen.ofNullable(passwordResetRequired);
            return this;
        }
        public Builder pgpKey(@Nullable Output<String> pgpKey) {
            this.pgpKey = pgpKey;
            return this;
        }
        public Builder pgpKey(@Nullable String pgpKey) {
            this.pgpKey = Codegen.ofNullable(pgpKey);
            return this;
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }
        public Builder user(@Nullable String user) {
            this.user = Codegen.ofNullable(user);
            return this;
        }        public UserLoginProfileState build() {
            return new UserLoginProfileState(encryptedPassword, keyFingerprint, passwordLength, passwordResetRequired, pgpKey, user);
        }
    }
}

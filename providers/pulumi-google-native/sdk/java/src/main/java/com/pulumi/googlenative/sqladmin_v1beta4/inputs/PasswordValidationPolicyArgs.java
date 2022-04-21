// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.sqladmin_v1beta4.enums.PasswordValidationPolicyComplexity;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Database instance local user password validation policy
 * 
 */
public final class PasswordValidationPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final PasswordValidationPolicyArgs Empty = new PasswordValidationPolicyArgs();

    /**
     * The complexity of the password.
     * 
     */
    @Import(name="complexity")
    private @Nullable Output<PasswordValidationPolicyComplexity> complexity;

    public Optional<Output<PasswordValidationPolicyComplexity>> complexity() {
        return Optional.ofNullable(this.complexity);
    }

    /**
     * Disallow username as a part of the password.
     * 
     */
    @Import(name="disallowUsernameSubstring")
    private @Nullable Output<Boolean> disallowUsernameSubstring;

    public Optional<Output<Boolean>> disallowUsernameSubstring() {
        return Optional.ofNullable(this.disallowUsernameSubstring);
    }

    /**
     * Minimum number of characters allowed.
     * 
     */
    @Import(name="minLength")
    private @Nullable Output<Integer> minLength;

    public Optional<Output<Integer>> minLength() {
        return Optional.ofNullable(this.minLength);
    }

    /**
     * Minimum interval after which the password can be changed. This flag is only supported for PostgresSQL.
     * 
     */
    @Import(name="passwordChangeInterval")
    private @Nullable Output<String> passwordChangeInterval;

    public Optional<Output<String>> passwordChangeInterval() {
        return Optional.ofNullable(this.passwordChangeInterval);
    }

    /**
     * Number of previous passwords that cannot be reused.
     * 
     */
    @Import(name="reuseInterval")
    private @Nullable Output<Integer> reuseInterval;

    public Optional<Output<Integer>> reuseInterval() {
        return Optional.ofNullable(this.reuseInterval);
    }

    private PasswordValidationPolicyArgs() {}

    private PasswordValidationPolicyArgs(PasswordValidationPolicyArgs $) {
        this.complexity = $.complexity;
        this.disallowUsernameSubstring = $.disallowUsernameSubstring;
        this.minLength = $.minLength;
        this.passwordChangeInterval = $.passwordChangeInterval;
        this.reuseInterval = $.reuseInterval;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PasswordValidationPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PasswordValidationPolicyArgs $;

        public Builder() {
            $ = new PasswordValidationPolicyArgs();
        }

        public Builder(PasswordValidationPolicyArgs defaults) {
            $ = new PasswordValidationPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder complexity(@Nullable Output<PasswordValidationPolicyComplexity> complexity) {
            $.complexity = complexity;
            return this;
        }

        public Builder complexity(PasswordValidationPolicyComplexity complexity) {
            return complexity(Output.of(complexity));
        }

        public Builder disallowUsernameSubstring(@Nullable Output<Boolean> disallowUsernameSubstring) {
            $.disallowUsernameSubstring = disallowUsernameSubstring;
            return this;
        }

        public Builder disallowUsernameSubstring(Boolean disallowUsernameSubstring) {
            return disallowUsernameSubstring(Output.of(disallowUsernameSubstring));
        }

        public Builder minLength(@Nullable Output<Integer> minLength) {
            $.minLength = minLength;
            return this;
        }

        public Builder minLength(Integer minLength) {
            return minLength(Output.of(minLength));
        }

        public Builder passwordChangeInterval(@Nullable Output<String> passwordChangeInterval) {
            $.passwordChangeInterval = passwordChangeInterval;
            return this;
        }

        public Builder passwordChangeInterval(String passwordChangeInterval) {
            return passwordChangeInterval(Output.of(passwordChangeInterval));
        }

        public Builder reuseInterval(@Nullable Output<Integer> reuseInterval) {
            $.reuseInterval = reuseInterval;
            return this;
        }

        public Builder reuseInterval(Integer reuseInterval) {
            return reuseInterval(Output.of(reuseInterval));
        }

        public PasswordValidationPolicyArgs build() {
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ConflictResolutionPolicyResponse {
    /**
     * The conflict resolution path in the case of LastWriterWins mode.
     * 
     */
    private final @Nullable String conflictResolutionPath;
    /**
     * The procedure to resolve conflicts in the case of custom mode.
     * 
     */
    private final @Nullable String conflictResolutionProcedure;
    /**
     * Indicates the conflict resolution mode.
     * 
     */
    private final @Nullable String mode;

    @CustomType.Constructor
    private ConflictResolutionPolicyResponse(
        @CustomType.Parameter("conflictResolutionPath") @Nullable String conflictResolutionPath,
        @CustomType.Parameter("conflictResolutionProcedure") @Nullable String conflictResolutionProcedure,
        @CustomType.Parameter("mode") @Nullable String mode) {
        this.conflictResolutionPath = conflictResolutionPath;
        this.conflictResolutionProcedure = conflictResolutionProcedure;
        this.mode = mode;
    }

    /**
     * The conflict resolution path in the case of LastWriterWins mode.
     * 
    */
    public Optional<String> conflictResolutionPath() {
        return Optional.ofNullable(this.conflictResolutionPath);
    }
    /**
     * The procedure to resolve conflicts in the case of custom mode.
     * 
    */
    public Optional<String> conflictResolutionProcedure() {
        return Optional.ofNullable(this.conflictResolutionProcedure);
    }
    /**
     * Indicates the conflict resolution mode.
     * 
    */
    public Optional<String> mode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConflictResolutionPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String conflictResolutionPath;
        private @Nullable String conflictResolutionProcedure;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(ConflictResolutionPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictResolutionPath = defaults.conflictResolutionPath;
    	      this.conflictResolutionProcedure = defaults.conflictResolutionProcedure;
    	      this.mode = defaults.mode;
        }

        public Builder conflictResolutionPath(@Nullable String conflictResolutionPath) {
            this.conflictResolutionPath = conflictResolutionPath;
            return this;
        }
        public Builder conflictResolutionProcedure(@Nullable String conflictResolutionProcedure) {
            this.conflictResolutionProcedure = conflictResolutionProcedure;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }        public ConflictResolutionPolicyResponse build() {
            return new ConflictResolutionPolicyResponse(conflictResolutionPath, conflictResolutionProcedure, mode);
        }
    }
}

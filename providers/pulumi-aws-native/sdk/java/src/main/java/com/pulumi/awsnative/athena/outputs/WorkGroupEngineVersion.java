// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.athena.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkGroupEngineVersion {
    private final @Nullable String effectiveEngineVersion;
    private final @Nullable String selectedEngineVersion;

    @CustomType.Constructor
    private WorkGroupEngineVersion(
        @CustomType.Parameter("effectiveEngineVersion") @Nullable String effectiveEngineVersion,
        @CustomType.Parameter("selectedEngineVersion") @Nullable String selectedEngineVersion) {
        this.effectiveEngineVersion = effectiveEngineVersion;
        this.selectedEngineVersion = selectedEngineVersion;
    }

    public Optional<String> effectiveEngineVersion() {
        return Optional.ofNullable(this.effectiveEngineVersion);
    }
    public Optional<String> selectedEngineVersion() {
        return Optional.ofNullable(this.selectedEngineVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkGroupEngineVersion defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String effectiveEngineVersion;
        private @Nullable String selectedEngineVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkGroupEngineVersion defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.effectiveEngineVersion = defaults.effectiveEngineVersion;
    	      this.selectedEngineVersion = defaults.selectedEngineVersion;
        }

        public Builder effectiveEngineVersion(@Nullable String effectiveEngineVersion) {
            this.effectiveEngineVersion = effectiveEngineVersion;
            return this;
        }
        public Builder selectedEngineVersion(@Nullable String selectedEngineVersion) {
            this.selectedEngineVersion = selectedEngineVersion;
            return this;
        }        public WorkGroupEngineVersion build() {
            return new WorkGroupEngineVersion(effectiveEngineVersion, selectedEngineVersion);
        }
    }
}

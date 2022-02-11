// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.LocalObjectReference;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FlexVolumeSource {
    private final String driver;
    private final @Nullable String fsType;
    private final @Nullable Map<String,String> options;
    private final @Nullable Boolean readOnly;
    private final @Nullable LocalObjectReference secretRef;

    @OutputCustomType.Constructor({"driver","fsType","options","readOnly","secretRef"})
    private FlexVolumeSource(
        String driver,
        @Nullable String fsType,
        @Nullable Map<String,String> options,
        @Nullable Boolean readOnly,
        @Nullable LocalObjectReference secretRef) {
        this.driver = Objects.requireNonNull(driver);
        this.fsType = fsType;
        this.options = options;
        this.readOnly = readOnly;
        this.secretRef = secretRef;
    }

    public String getDriver() {
        return this.driver;
    }
    public Optional<String> getFsType() {
        return Optional.ofNullable(this.fsType);
    }
    public Map<String,String> getOptions() {
        return this.options == null ? Map.of() : this.options;
    }
    public Optional<Boolean> getReadOnly() {
        return Optional.ofNullable(this.readOnly);
    }
    public Optional<LocalObjectReference> getSecretRef() {
        return Optional.ofNullable(this.secretRef);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String driver;
        private @Nullable String fsType;
        private @Nullable Map<String,String> options;
        private @Nullable Boolean readOnly;
        private @Nullable LocalObjectReference secretRef;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.fsType = defaults.fsType;
    	      this.options = defaults.options;
    	      this.readOnly = defaults.readOnly;
    	      this.secretRef = defaults.secretRef;
        }

        public Builder setDriver(String driver) {
            this.driver = Objects.requireNonNull(driver);
            return this;
        }

        public Builder setFsType(@Nullable String fsType) {
            this.fsType = fsType;
            return this;
        }

        public Builder setOptions(@Nullable Map<String,String> options) {
            this.options = options;
            return this;
        }

        public Builder setReadOnly(@Nullable Boolean readOnly) {
            this.readOnly = readOnly;
            return this;
        }

        public Builder setSecretRef(@Nullable LocalObjectReference secretRef) {
            this.secretRef = secretRef;
            return this;
        }

        public FlexVolumeSource build() {
            return new FlexVolumeSource(driver, fsType, options, readOnly, secretRef);
        }
    }
}

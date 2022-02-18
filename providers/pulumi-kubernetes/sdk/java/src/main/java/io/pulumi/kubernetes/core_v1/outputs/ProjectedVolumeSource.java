// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import io.pulumi.kubernetes.core_v1.outputs.VolumeProjection;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProjectedVolumeSource {
    /**
     * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    private final @Nullable Integer defaultMode;
    /**
     * list of volume projections
     * 
     */
    private final List<VolumeProjection> sources;

    @OutputCustomType.Constructor({"defaultMode","sources"})
    private ProjectedVolumeSource(
        @Nullable Integer defaultMode,
        List<VolumeProjection> sources) {
        this.defaultMode = defaultMode;
        this.sources = Objects.requireNonNull(sources);
    }

    /**
     * Mode bits used to set permissions on created files by default. Must be an octal value between 0000 and 0777 or a decimal value between 0 and 511. YAML accepts both octal and decimal values, JSON requires decimal values for mode bits. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
     * 
     */
    public Optional<Integer> getDefaultMode() {
        return Optional.ofNullable(this.defaultMode);
    }
    /**
     * list of volume projections
     * 
     */
    public List<VolumeProjection> getSources() {
        return this.sources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectedVolumeSource defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer defaultMode;
        private List<VolumeProjection> sources;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectedVolumeSource defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultMode = defaults.defaultMode;
    	      this.sources = defaults.sources;
        }

        public Builder setDefaultMode(@Nullable Integer defaultMode) {
            this.defaultMode = defaultMode;
            return this;
        }

        public Builder setSources(List<VolumeProjection> sources) {
            this.sources = Objects.requireNonNull(sources);
            return this;
        }

        public ProjectedVolumeSource build() {
            return new ProjectedVolumeSource(defaultMode, sources);
        }
    }
}

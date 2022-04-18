// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.efs.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class FileSystemLifecyclePolicy extends com.pulumi.resources.InvokeArgs {

    public static final FileSystemLifecyclePolicy Empty = new FileSystemLifecyclePolicy();

    @Import(name="transitionToIA")
      private final @Nullable String transitionToIA;

    public Optional<String> transitionToIA() {
        return this.transitionToIA == null ? Optional.empty() : Optional.ofNullable(this.transitionToIA);
    }

    @Import(name="transitionToPrimaryStorageClass")
      private final @Nullable String transitionToPrimaryStorageClass;

    public Optional<String> transitionToPrimaryStorageClass() {
        return this.transitionToPrimaryStorageClass == null ? Optional.empty() : Optional.ofNullable(this.transitionToPrimaryStorageClass);
    }

    public FileSystemLifecyclePolicy(
        @Nullable String transitionToIA,
        @Nullable String transitionToPrimaryStorageClass) {
        this.transitionToIA = transitionToIA;
        this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
    }

    private FileSystemLifecyclePolicy() {
        this.transitionToIA = null;
        this.transitionToPrimaryStorageClass = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FileSystemLifecyclePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String transitionToIA;
        private @Nullable String transitionToPrimaryStorageClass;

        public Builder() {
    	      // Empty
        }

        public Builder(FileSystemLifecyclePolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.transitionToIA = defaults.transitionToIA;
    	      this.transitionToPrimaryStorageClass = defaults.transitionToPrimaryStorageClass;
        }

        public Builder transitionToIA(@Nullable String transitionToIA) {
            this.transitionToIA = transitionToIA;
            return this;
        }
        public Builder transitionToPrimaryStorageClass(@Nullable String transitionToPrimaryStorageClass) {
            this.transitionToPrimaryStorageClass = transitionToPrimaryStorageClass;
            return this;
        }        public FileSystemLifecyclePolicy build() {
            return new FileSystemLifecyclePolicy(transitionToIA, transitionToPrimaryStorageClass);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.appengine_v1.inputs.VolumeArgs;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Machine resources for a version.
 * 
 */
public final class ResourcesArgs extends com.pulumi.resources.ResourceArgs {

    public static final ResourcesArgs Empty = new ResourcesArgs();

    /**
     * Number of CPU cores needed.
     * 
     */
    @Import(name="cpu")
      private final @Nullable Output<Double> cpu;

    public Output<Double> cpu() {
        return this.cpu == null ? Codegen.empty() : this.cpu;
    }

    /**
     * Disk size (GB) needed.
     * 
     */
    @Import(name="diskGb")
      private final @Nullable Output<Double> diskGb;

    public Output<Double> diskGb() {
        return this.diskGb == null ? Codegen.empty() : this.diskGb;
    }

    /**
     * The name of the encryption key that is stored in Google Cloud KMS. Only should be used by Cloud Composer to encrypt the vm disk
     * 
     */
    @Import(name="kmsKeyReference")
      private final @Nullable Output<String> kmsKeyReference;

    public Output<String> kmsKeyReference() {
        return this.kmsKeyReference == null ? Codegen.empty() : this.kmsKeyReference;
    }

    /**
     * Memory (GB) needed.
     * 
     */
    @Import(name="memoryGb")
      private final @Nullable Output<Double> memoryGb;

    public Output<Double> memoryGb() {
        return this.memoryGb == null ? Codegen.empty() : this.memoryGb;
    }

    /**
     * User specified volumes.
     * 
     */
    @Import(name="volumes")
      private final @Nullable Output<List<VolumeArgs>> volumes;

    public Output<List<VolumeArgs>> volumes() {
        return this.volumes == null ? Codegen.empty() : this.volumes;
    }

    public ResourcesArgs(
        @Nullable Output<Double> cpu,
        @Nullable Output<Double> diskGb,
        @Nullable Output<String> kmsKeyReference,
        @Nullable Output<Double> memoryGb,
        @Nullable Output<List<VolumeArgs>> volumes) {
        this.cpu = cpu;
        this.diskGb = diskGb;
        this.kmsKeyReference = kmsKeyReference;
        this.memoryGb = memoryGb;
        this.volumes = volumes;
    }

    private ResourcesArgs() {
        this.cpu = Codegen.empty();
        this.diskGb = Codegen.empty();
        this.kmsKeyReference = Codegen.empty();
        this.memoryGb = Codegen.empty();
        this.volumes = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourcesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Double> cpu;
        private @Nullable Output<Double> diskGb;
        private @Nullable Output<String> kmsKeyReference;
        private @Nullable Output<Double> memoryGb;
        private @Nullable Output<List<VolumeArgs>> volumes;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourcesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cpu = defaults.cpu;
    	      this.diskGb = defaults.diskGb;
    	      this.kmsKeyReference = defaults.kmsKeyReference;
    	      this.memoryGb = defaults.memoryGb;
    	      this.volumes = defaults.volumes;
        }

        public Builder cpu(@Nullable Output<Double> cpu) {
            this.cpu = cpu;
            return this;
        }
        public Builder cpu(@Nullable Double cpu) {
            this.cpu = Codegen.ofNullable(cpu);
            return this;
        }
        public Builder diskGb(@Nullable Output<Double> diskGb) {
            this.diskGb = diskGb;
            return this;
        }
        public Builder diskGb(@Nullable Double diskGb) {
            this.diskGb = Codegen.ofNullable(diskGb);
            return this;
        }
        public Builder kmsKeyReference(@Nullable Output<String> kmsKeyReference) {
            this.kmsKeyReference = kmsKeyReference;
            return this;
        }
        public Builder kmsKeyReference(@Nullable String kmsKeyReference) {
            this.kmsKeyReference = Codegen.ofNullable(kmsKeyReference);
            return this;
        }
        public Builder memoryGb(@Nullable Output<Double> memoryGb) {
            this.memoryGb = memoryGb;
            return this;
        }
        public Builder memoryGb(@Nullable Double memoryGb) {
            this.memoryGb = Codegen.ofNullable(memoryGb);
            return this;
        }
        public Builder volumes(@Nullable Output<List<VolumeArgs>> volumes) {
            this.volumes = volumes;
            return this;
        }
        public Builder volumes(@Nullable List<VolumeArgs> volumes) {
            this.volumes = Codegen.ofNullable(volumes);
            return this;
        }
        public Builder volumes(VolumeArgs... volumes) {
            return volumes(List.of(volumes));
        }        public ResourcesArgs build() {
            return new ResourcesArgs(cpu, diskGb, kmsKeyReference, memoryGb, volumes);
        }
    }
}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.appengine_v1beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Target scaling by disk usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class DiskUtilizationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DiskUtilizationArgs Empty = new DiskUtilizationArgs();

    /**
     * Target bytes read per second.
     * 
     */
    @Import(name="targetReadBytesPerSecond")
    private @Nullable Output<Integer> targetReadBytesPerSecond;

    public Optional<Output<Integer>> targetReadBytesPerSecond() {
        return Optional.ofNullable(this.targetReadBytesPerSecond);
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @Import(name="targetReadOpsPerSecond")
    private @Nullable Output<Integer> targetReadOpsPerSecond;

    public Optional<Output<Integer>> targetReadOpsPerSecond() {
        return Optional.ofNullable(this.targetReadOpsPerSecond);
    }

    /**
     * Target bytes written per second.
     * 
     */
    @Import(name="targetWriteBytesPerSecond")
    private @Nullable Output<Integer> targetWriteBytesPerSecond;

    public Optional<Output<Integer>> targetWriteBytesPerSecond() {
        return Optional.ofNullable(this.targetWriteBytesPerSecond);
    }

    /**
     * Target ops written per second.
     * 
     */
    @Import(name="targetWriteOpsPerSecond")
    private @Nullable Output<Integer> targetWriteOpsPerSecond;

    public Optional<Output<Integer>> targetWriteOpsPerSecond() {
        return Optional.ofNullable(this.targetWriteOpsPerSecond);
    }

    private DiskUtilizationArgs() {}

    private DiskUtilizationArgs(DiskUtilizationArgs $) {
        this.targetReadBytesPerSecond = $.targetReadBytesPerSecond;
        this.targetReadOpsPerSecond = $.targetReadOpsPerSecond;
        this.targetWriteBytesPerSecond = $.targetWriteBytesPerSecond;
        this.targetWriteOpsPerSecond = $.targetWriteOpsPerSecond;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DiskUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DiskUtilizationArgs $;

        public Builder() {
            $ = new DiskUtilizationArgs();
        }

        public Builder(DiskUtilizationArgs defaults) {
            $ = new DiskUtilizationArgs(Objects.requireNonNull(defaults));
        }

        public Builder targetReadBytesPerSecond(@Nullable Output<Integer> targetReadBytesPerSecond) {
            $.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }

        public Builder targetReadBytesPerSecond(Integer targetReadBytesPerSecond) {
            return targetReadBytesPerSecond(Output.of(targetReadBytesPerSecond));
        }

        public Builder targetReadOpsPerSecond(@Nullable Output<Integer> targetReadOpsPerSecond) {
            $.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }

        public Builder targetReadOpsPerSecond(Integer targetReadOpsPerSecond) {
            return targetReadOpsPerSecond(Output.of(targetReadOpsPerSecond));
        }

        public Builder targetWriteBytesPerSecond(@Nullable Output<Integer> targetWriteBytesPerSecond) {
            $.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }

        public Builder targetWriteBytesPerSecond(Integer targetWriteBytesPerSecond) {
            return targetWriteBytesPerSecond(Output.of(targetWriteBytesPerSecond));
        }

        public Builder targetWriteOpsPerSecond(@Nullable Output<Integer> targetWriteOpsPerSecond) {
            $.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }

        public Builder targetWriteOpsPerSecond(Integer targetWriteOpsPerSecond) {
            return targetWriteOpsPerSecond(Output.of(targetWriteOpsPerSecond));
        }

        public DiskUtilizationArgs build() {
            return $;
        }
    }

}

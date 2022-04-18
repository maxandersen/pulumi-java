// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.ivs;

import com.pulumi.awsnative.ivs.enums.ChannelLatencyMode;
import com.pulumi.awsnative.ivs.enums.ChannelType;
import com.pulumi.awsnative.ivs.inputs.ChannelTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelArgs Empty = new ChannelArgs();

    /**
     * Whether the channel is authorized.
     * 
     */
    @Import(name="authorized")
      private final @Nullable Output<Boolean> authorized;

    public Output<Boolean> authorized() {
        return this.authorized == null ? Codegen.empty() : this.authorized;
    }

    /**
     * Channel latency mode.
     * 
     */
    @Import(name="latencyMode")
      private final @Nullable Output<ChannelLatencyMode> latencyMode;

    public Output<ChannelLatencyMode> latencyMode() {
        return this.latencyMode == null ? Codegen.empty() : this.latencyMode;
    }

    /**
     * Channel
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Recording Configuration ARN. A value other than an empty string indicates that recording is enabled. Default: “” (recording is disabled).
     * 
     */
    @Import(name="recordingConfigurationArn")
      private final @Nullable Output<String> recordingConfigurationArn;

    public Output<String> recordingConfigurationArn() {
        return this.recordingConfigurationArn == null ? Codegen.empty() : this.recordingConfigurationArn;
    }

    /**
     * A list of key-value pairs that contain metadata for the asset model.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ChannelTagArgs>> tags;

    public Output<List<ChannelTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Channel type, which determines the allowable resolution and bitrate. If you exceed the allowable resolution or bitrate, the stream probably will disconnect immediately.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ChannelType> type;

    public Output<ChannelType> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ChannelArgs(
        @Nullable Output<Boolean> authorized,
        @Nullable Output<ChannelLatencyMode> latencyMode,
        @Nullable Output<String> name,
        @Nullable Output<String> recordingConfigurationArn,
        @Nullable Output<List<ChannelTagArgs>> tags,
        @Nullable Output<ChannelType> type) {
        this.authorized = authorized;
        this.latencyMode = latencyMode;
        this.name = name;
        this.recordingConfigurationArn = recordingConfigurationArn;
        this.tags = tags;
        this.type = type;
    }

    private ChannelArgs() {
        this.authorized = Codegen.empty();
        this.latencyMode = Codegen.empty();
        this.name = Codegen.empty();
        this.recordingConfigurationArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> authorized;
        private @Nullable Output<ChannelLatencyMode> latencyMode;
        private @Nullable Output<String> name;
        private @Nullable Output<String> recordingConfigurationArn;
        private @Nullable Output<List<ChannelTagArgs>> tags;
        private @Nullable Output<ChannelType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorized = defaults.authorized;
    	      this.latencyMode = defaults.latencyMode;
    	      this.name = defaults.name;
    	      this.recordingConfigurationArn = defaults.recordingConfigurationArn;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder authorized(@Nullable Output<Boolean> authorized) {
            this.authorized = authorized;
            return this;
        }
        public Builder authorized(@Nullable Boolean authorized) {
            this.authorized = Codegen.ofNullable(authorized);
            return this;
        }
        public Builder latencyMode(@Nullable Output<ChannelLatencyMode> latencyMode) {
            this.latencyMode = latencyMode;
            return this;
        }
        public Builder latencyMode(@Nullable ChannelLatencyMode latencyMode) {
            this.latencyMode = Codegen.ofNullable(latencyMode);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder recordingConfigurationArn(@Nullable Output<String> recordingConfigurationArn) {
            this.recordingConfigurationArn = recordingConfigurationArn;
            return this;
        }
        public Builder recordingConfigurationArn(@Nullable String recordingConfigurationArn) {
            this.recordingConfigurationArn = Codegen.ofNullable(recordingConfigurationArn);
            return this;
        }
        public Builder tags(@Nullable Output<List<ChannelTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ChannelTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(ChannelTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder type(@Nullable Output<ChannelType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ChannelType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ChannelArgs build() {
            return new ChannelArgs(authorized, latencyMode, name, recordingConfigurationArn, tags, type);
        }
    }
}

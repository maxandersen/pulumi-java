// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.devicefarm;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkProfileArgs extends com.pulumi.resources.ResourceArgs {

    public static final NetworkProfileArgs Empty = new NetworkProfileArgs();

    /**
     * The description of the network profile.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Import(name="downlinkBandwidthBits")
      private final @Nullable Output<Integer> downlinkBandwidthBits;

    public Output<Integer> downlinkBandwidthBits() {
        return this.downlinkBandwidthBits == null ? Codegen.empty() : this.downlinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="downlinkDelayMs")
      private final @Nullable Output<Integer> downlinkDelayMs;

    public Output<Integer> downlinkDelayMs() {
        return this.downlinkDelayMs == null ? Codegen.empty() : this.downlinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="downlinkJitterMs")
      private final @Nullable Output<Integer> downlinkJitterMs;

    public Output<Integer> downlinkJitterMs() {
        return this.downlinkJitterMs == null ? Codegen.empty() : this.downlinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Import(name="downlinkLossPercent")
      private final @Nullable Output<Integer> downlinkLossPercent;

    public Output<Integer> downlinkLossPercent() {
        return this.downlinkLossPercent == null ? Codegen.empty() : this.downlinkLossPercent;
    }

    /**
     * The name for the network profile.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ARN of the project for the network profile.
     * 
     */
    @Import(name="projectArn", required=true)
      private final Output<String> projectArn;

    public Output<String> projectArn() {
        return this.projectArn;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The type of network profile to create. Valid values are listed are `PRIVATE` and `CURATED`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> type() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * The data throughput rate in bits per second, as an integer from `0` to `104857600`. Default value is `104857600`.
     * 
     */
    @Import(name="uplinkBandwidthBits")
      private final @Nullable Output<Integer> uplinkBandwidthBits;

    public Output<Integer> uplinkBandwidthBits() {
        return this.uplinkBandwidthBits == null ? Codegen.empty() : this.uplinkBandwidthBits;
    }

    /**
     * Delay time for all packets to destination in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="uplinkDelayMs")
      private final @Nullable Output<Integer> uplinkDelayMs;

    public Output<Integer> uplinkDelayMs() {
        return this.uplinkDelayMs == null ? Codegen.empty() : this.uplinkDelayMs;
    }

    /**
     * Time variation in the delay of received packets in milliseconds as an integer from `0` to `2000`.
     * 
     */
    @Import(name="uplinkJitterMs")
      private final @Nullable Output<Integer> uplinkJitterMs;

    public Output<Integer> uplinkJitterMs() {
        return this.uplinkJitterMs == null ? Codegen.empty() : this.uplinkJitterMs;
    }

    /**
     * Proportion of received packets that fail to arrive from `0` to `100` percent.
     * 
     */
    @Import(name="uplinkLossPercent")
      private final @Nullable Output<Integer> uplinkLossPercent;

    public Output<Integer> uplinkLossPercent() {
        return this.uplinkLossPercent == null ? Codegen.empty() : this.uplinkLossPercent;
    }

    public NetworkProfileArgs(
        @Nullable Output<String> description,
        @Nullable Output<Integer> downlinkBandwidthBits,
        @Nullable Output<Integer> downlinkDelayMs,
        @Nullable Output<Integer> downlinkJitterMs,
        @Nullable Output<Integer> downlinkLossPercent,
        @Nullable Output<String> name,
        Output<String> projectArn,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type,
        @Nullable Output<Integer> uplinkBandwidthBits,
        @Nullable Output<Integer> uplinkDelayMs,
        @Nullable Output<Integer> uplinkJitterMs,
        @Nullable Output<Integer> uplinkLossPercent) {
        this.description = description;
        this.downlinkBandwidthBits = downlinkBandwidthBits;
        this.downlinkDelayMs = downlinkDelayMs;
        this.downlinkJitterMs = downlinkJitterMs;
        this.downlinkLossPercent = downlinkLossPercent;
        this.name = name;
        this.projectArn = Objects.requireNonNull(projectArn, "expected parameter 'projectArn' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
        this.uplinkBandwidthBits = uplinkBandwidthBits;
        this.uplinkDelayMs = uplinkDelayMs;
        this.uplinkJitterMs = uplinkJitterMs;
        this.uplinkLossPercent = uplinkLossPercent;
    }

    private NetworkProfileArgs() {
        this.description = Codegen.empty();
        this.downlinkBandwidthBits = Codegen.empty();
        this.downlinkDelayMs = Codegen.empty();
        this.downlinkJitterMs = Codegen.empty();
        this.downlinkLossPercent = Codegen.empty();
        this.name = Codegen.empty();
        this.projectArn = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.type = Codegen.empty();
        this.uplinkBandwidthBits = Codegen.empty();
        this.uplinkDelayMs = Codegen.empty();
        this.uplinkJitterMs = Codegen.empty();
        this.uplinkLossPercent = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> downlinkBandwidthBits;
        private @Nullable Output<Integer> downlinkDelayMs;
        private @Nullable Output<Integer> downlinkJitterMs;
        private @Nullable Output<Integer> downlinkLossPercent;
        private @Nullable Output<String> name;
        private Output<String> projectArn;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;
        private @Nullable Output<Integer> uplinkBandwidthBits;
        private @Nullable Output<Integer> uplinkDelayMs;
        private @Nullable Output<Integer> uplinkJitterMs;
        private @Nullable Output<Integer> uplinkLossPercent;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.downlinkBandwidthBits = defaults.downlinkBandwidthBits;
    	      this.downlinkDelayMs = defaults.downlinkDelayMs;
    	      this.downlinkJitterMs = defaults.downlinkJitterMs;
    	      this.downlinkLossPercent = defaults.downlinkLossPercent;
    	      this.name = defaults.name;
    	      this.projectArn = defaults.projectArn;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
    	      this.uplinkBandwidthBits = defaults.uplinkBandwidthBits;
    	      this.uplinkDelayMs = defaults.uplinkDelayMs;
    	      this.uplinkJitterMs = defaults.uplinkJitterMs;
    	      this.uplinkLossPercent = defaults.uplinkLossPercent;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder downlinkBandwidthBits(@Nullable Output<Integer> downlinkBandwidthBits) {
            this.downlinkBandwidthBits = downlinkBandwidthBits;
            return this;
        }
        public Builder downlinkBandwidthBits(@Nullable Integer downlinkBandwidthBits) {
            this.downlinkBandwidthBits = Codegen.ofNullable(downlinkBandwidthBits);
            return this;
        }
        public Builder downlinkDelayMs(@Nullable Output<Integer> downlinkDelayMs) {
            this.downlinkDelayMs = downlinkDelayMs;
            return this;
        }
        public Builder downlinkDelayMs(@Nullable Integer downlinkDelayMs) {
            this.downlinkDelayMs = Codegen.ofNullable(downlinkDelayMs);
            return this;
        }
        public Builder downlinkJitterMs(@Nullable Output<Integer> downlinkJitterMs) {
            this.downlinkJitterMs = downlinkJitterMs;
            return this;
        }
        public Builder downlinkJitterMs(@Nullable Integer downlinkJitterMs) {
            this.downlinkJitterMs = Codegen.ofNullable(downlinkJitterMs);
            return this;
        }
        public Builder downlinkLossPercent(@Nullable Output<Integer> downlinkLossPercent) {
            this.downlinkLossPercent = downlinkLossPercent;
            return this;
        }
        public Builder downlinkLossPercent(@Nullable Integer downlinkLossPercent) {
            this.downlinkLossPercent = Codegen.ofNullable(downlinkLossPercent);
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
        public Builder projectArn(Output<String> projectArn) {
            this.projectArn = Objects.requireNonNull(projectArn);
            return this;
        }
        public Builder projectArn(String projectArn) {
            this.projectArn = Output.of(Objects.requireNonNull(projectArn));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder uplinkBandwidthBits(@Nullable Output<Integer> uplinkBandwidthBits) {
            this.uplinkBandwidthBits = uplinkBandwidthBits;
            return this;
        }
        public Builder uplinkBandwidthBits(@Nullable Integer uplinkBandwidthBits) {
            this.uplinkBandwidthBits = Codegen.ofNullable(uplinkBandwidthBits);
            return this;
        }
        public Builder uplinkDelayMs(@Nullable Output<Integer> uplinkDelayMs) {
            this.uplinkDelayMs = uplinkDelayMs;
            return this;
        }
        public Builder uplinkDelayMs(@Nullable Integer uplinkDelayMs) {
            this.uplinkDelayMs = Codegen.ofNullable(uplinkDelayMs);
            return this;
        }
        public Builder uplinkJitterMs(@Nullable Output<Integer> uplinkJitterMs) {
            this.uplinkJitterMs = uplinkJitterMs;
            return this;
        }
        public Builder uplinkJitterMs(@Nullable Integer uplinkJitterMs) {
            this.uplinkJitterMs = Codegen.ofNullable(uplinkJitterMs);
            return this;
        }
        public Builder uplinkLossPercent(@Nullable Output<Integer> uplinkLossPercent) {
            this.uplinkLossPercent = uplinkLossPercent;
            return this;
        }
        public Builder uplinkLossPercent(@Nullable Integer uplinkLossPercent) {
            this.uplinkLossPercent = Codegen.ofNullable(uplinkLossPercent);
            return this;
        }        public NetworkProfileArgs build() {
            return new NetworkProfileArgs(description, downlinkBandwidthBits, downlinkDelayMs, downlinkJitterMs, downlinkLossPercent, name, projectArn, tags, tagsAll, type, uplinkBandwidthBits, uplinkDelayMs, uplinkJitterMs, uplinkLossPercent);
        }
    }
}

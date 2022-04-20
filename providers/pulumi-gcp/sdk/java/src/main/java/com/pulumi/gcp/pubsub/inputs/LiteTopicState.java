// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.pubsub.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.gcp.pubsub.inputs.LiteTopicPartitionConfigGetArgs;
import com.pulumi.gcp.pubsub.inputs.LiteTopicReservationConfigGetArgs;
import com.pulumi.gcp.pubsub.inputs.LiteTopicRetentionConfigGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class LiteTopicState extends com.pulumi.resources.ResourceArgs {

    public static final LiteTopicState Empty = new LiteTopicState();

    /**
     * Name of the topic.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The settings for this topic&#39;s partitions.
     * Structure is documented below.
     * 
     */
    @Import(name="partitionConfig")
      private final @Nullable Output<LiteTopicPartitionConfigGetArgs> partitionConfig;

    public Output<LiteTopicPartitionConfigGetArgs> partitionConfig() {
        return this.partitionConfig == null ? Codegen.empty() : this.partitionConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region of the pubsub lite topic.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> region() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The settings for this topic&#39;s Reservation usage.
     * Structure is documented below.
     * 
     */
    @Import(name="reservationConfig")
      private final @Nullable Output<LiteTopicReservationConfigGetArgs> reservationConfig;

    public Output<LiteTopicReservationConfigGetArgs> reservationConfig() {
        return this.reservationConfig == null ? Codegen.empty() : this.reservationConfig;
    }

    /**
     * The settings for a topic&#39;s message retention.
     * Structure is documented below.
     * 
     */
    @Import(name="retentionConfig")
      private final @Nullable Output<LiteTopicRetentionConfigGetArgs> retentionConfig;

    public Output<LiteTopicRetentionConfigGetArgs> retentionConfig() {
        return this.retentionConfig == null ? Codegen.empty() : this.retentionConfig;
    }

    /**
     * The zone of the pubsub lite topic.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> zone() {
        return this.zone == null ? Codegen.empty() : this.zone;
    }

    public LiteTopicState(
        @Nullable Output<String> name,
        @Nullable Output<LiteTopicPartitionConfigGetArgs> partitionConfig,
        @Nullable Output<String> project,
        @Nullable Output<String> region,
        @Nullable Output<LiteTopicReservationConfigGetArgs> reservationConfig,
        @Nullable Output<LiteTopicRetentionConfigGetArgs> retentionConfig,
        @Nullable Output<String> zone) {
        this.name = name;
        this.partitionConfig = partitionConfig;
        this.project = project;
        this.region = region;
        this.reservationConfig = reservationConfig;
        this.retentionConfig = retentionConfig;
        this.zone = zone;
    }

    private LiteTopicState() {
        this.name = Codegen.empty();
        this.partitionConfig = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.reservationConfig = Codegen.empty();
        this.retentionConfig = Codegen.empty();
        this.zone = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LiteTopicState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<LiteTopicPartitionConfigGetArgs> partitionConfig;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;
        private @Nullable Output<LiteTopicReservationConfigGetArgs> reservationConfig;
        private @Nullable Output<LiteTopicRetentionConfigGetArgs> retentionConfig;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(LiteTopicState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.partitionConfig = defaults.partitionConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.reservationConfig = defaults.reservationConfig;
    	      this.retentionConfig = defaults.retentionConfig;
    	      this.zone = defaults.zone;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder partitionConfig(@Nullable Output<LiteTopicPartitionConfigGetArgs> partitionConfig) {
            this.partitionConfig = partitionConfig;
            return this;
        }
        public Builder partitionConfig(@Nullable LiteTopicPartitionConfigGetArgs partitionConfig) {
            this.partitionConfig = Codegen.ofNullable(partitionConfig);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder reservationConfig(@Nullable Output<LiteTopicReservationConfigGetArgs> reservationConfig) {
            this.reservationConfig = reservationConfig;
            return this;
        }
        public Builder reservationConfig(@Nullable LiteTopicReservationConfigGetArgs reservationConfig) {
            this.reservationConfig = Codegen.ofNullable(reservationConfig);
            return this;
        }
        public Builder retentionConfig(@Nullable Output<LiteTopicRetentionConfigGetArgs> retentionConfig) {
            this.retentionConfig = retentionConfig;
            return this;
        }
        public Builder retentionConfig(@Nullable LiteTopicRetentionConfigGetArgs retentionConfig) {
            this.retentionConfig = Codegen.ofNullable(retentionConfig);
            return this;
        }
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Codegen.ofNullable(zone);
            return this;
        }        public LiteTopicState build() {
            return new LiteTopicState(name, partitionConfig, project, region, reservationConfig, retentionConfig, zone);
        }
    }
}

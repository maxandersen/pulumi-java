// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.azurenative.botservice.inputs.KikChannelPropertiesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Kik channel definition
 * 
 */
public final class KikChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final KikChannelArgs Empty = new KikChannelArgs();

    /**
     * The channel name
     * Expected value is &#39;KikChannel&#39;.
     * 
     */
    @Import(name="channelName", required=true)
      private final Output<String> channelName;

    public Output<String> channelName() {
        return this.channelName;
    }

    /**
     * Entity Tag of the resource
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> etag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * Specifies the location of the resource.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The set of properties specific to Kik channel resource
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<KikChannelPropertiesArgs> properties;

    public Output<KikChannelPropertiesArgs> properties() {
        return this.properties == null ? Codegen.empty() : this.properties;
    }

    public KikChannelArgs(
        Output<String> channelName,
        @Nullable Output<String> etag,
        @Nullable Output<String> location,
        @Nullable Output<KikChannelPropertiesArgs> properties) {
        this.channelName = Codegen.stringProp("channelName").output().arg(channelName).require();
        this.etag = etag;
        this.location = Codegen.stringProp("location").output().arg(location).def("global").getNullable();
        this.properties = properties;
    }

    private KikChannelArgs() {
        this.channelName = Codegen.empty();
        this.etag = Codegen.empty();
        this.location = Codegen.empty();
        this.properties = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KikChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> channelName;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> location;
        private @Nullable Output<KikChannelPropertiesArgs> properties;

        public Builder() {
    	      // Empty
        }

        public Builder(KikChannelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelName = defaults.channelName;
    	      this.etag = defaults.etag;
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
        }

        public Builder channelName(Output<String> channelName) {
            this.channelName = Objects.requireNonNull(channelName);
            return this;
        }
        public Builder channelName(String channelName) {
            this.channelName = Output.of(Objects.requireNonNull(channelName));
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder properties(@Nullable Output<KikChannelPropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable KikChannelPropertiesArgs properties) {
            this.properties = Codegen.ofNullable(properties);
            return this;
        }        public KikChannelArgs build() {
            return new KikChannelArgs(channelName, etag, location, properties);
        }
    }
}

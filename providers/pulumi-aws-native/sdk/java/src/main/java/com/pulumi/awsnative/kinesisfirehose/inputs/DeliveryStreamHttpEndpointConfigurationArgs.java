// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.kinesisfirehose.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeliveryStreamHttpEndpointConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamHttpEndpointConfigurationArgs Empty = new DeliveryStreamHttpEndpointConfigurationArgs();

    @Import(name="accessKey")
    private @Nullable Output<String> accessKey;

    public Optional<Output<String>> accessKey() {
        return Optional.ofNullable(this.accessKey);
    }

    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    @Import(name="url", required=true)
    private Output<String> url;

    public Output<String> url() {
        return this.url;
    }

    private DeliveryStreamHttpEndpointConfigurationArgs() {}

    private DeliveryStreamHttpEndpointConfigurationArgs(DeliveryStreamHttpEndpointConfigurationArgs $) {
        this.accessKey = $.accessKey;
        this.name = $.name;
        this.url = $.url;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DeliveryStreamHttpEndpointConfigurationArgs $;

        public Builder() {
            $ = new DeliveryStreamHttpEndpointConfigurationArgs();
        }

        public Builder(DeliveryStreamHttpEndpointConfigurationArgs defaults) {
            $ = new DeliveryStreamHttpEndpointConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessKey(@Nullable Output<String> accessKey) {
            $.accessKey = accessKey;
            return this;
        }

        public Builder accessKey(String accessKey) {
            return accessKey(Output.of(accessKey));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder url(Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public DeliveryStreamHttpEndpointConfigurationArgs build() {
            $.url = Objects.requireNonNull($.url, "expected parameter 'url' to be non-null");
            return $;
        }
    }

}

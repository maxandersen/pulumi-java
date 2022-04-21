// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediapackage.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ChannelHlsIngestIngestEndpointArgs extends com.pulumi.resources.ResourceArgs {

    public static final ChannelHlsIngestIngestEndpointArgs Empty = new ChannelHlsIngestIngestEndpointArgs();

    /**
     * The password
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    /**
     * The URL
     * 
     */
    @Import(name="url")
    private @Nullable Output<String> url;

    public Optional<Output<String>> url() {
        return Optional.ofNullable(this.url);
    }

    /**
     * The username
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    private ChannelHlsIngestIngestEndpointArgs() {}

    private ChannelHlsIngestIngestEndpointArgs(ChannelHlsIngestIngestEndpointArgs $) {
        this.password = $.password;
        this.url = $.url;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ChannelHlsIngestIngestEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ChannelHlsIngestIngestEndpointArgs $;

        public Builder() {
            $ = new ChannelHlsIngestIngestEndpointArgs();
        }

        public Builder(ChannelHlsIngestIngestEndpointArgs defaults) {
            $ = new ChannelHlsIngestIngestEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        public Builder password(String password) {
            return password(Output.of(password));
        }

        public Builder url(@Nullable Output<String> url) {
            $.url = url;
            return this;
        }

        public Builder url(String url) {
            return url(Output.of(url));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public ChannelHlsIngestIngestEndpointArgs build() {
            return $;
        }
    }

}

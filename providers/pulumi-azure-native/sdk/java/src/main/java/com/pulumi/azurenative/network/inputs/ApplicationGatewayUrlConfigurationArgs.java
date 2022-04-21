// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Url configuration of the Actions set in Application Gateway.
 * 
 */
public final class ApplicationGatewayUrlConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayUrlConfigurationArgs Empty = new ApplicationGatewayUrlConfigurationArgs();

    /**
     * Url path which user has provided for url rewrite. Null means no path will be updated. Default value is null.
     * 
     */
    @Import(name="modifiedPath")
    private @Nullable Output<String> modifiedPath;

    public Optional<Output<String>> modifiedPath() {
        return Optional.ofNullable(this.modifiedPath);
    }

    /**
     * Query string which user has provided for url rewrite. Null means no query string will be updated. Default value is null.
     * 
     */
    @Import(name="modifiedQueryString")
    private @Nullable Output<String> modifiedQueryString;

    public Optional<Output<String>> modifiedQueryString() {
        return Optional.ofNullable(this.modifiedQueryString);
    }

    /**
     * If set as true, it will re-evaluate the url path map provided in path based request routing rules using modified path. Default value is false.
     * 
     */
    @Import(name="reroute")
    private @Nullable Output<Boolean> reroute;

    public Optional<Output<Boolean>> reroute() {
        return Optional.ofNullable(this.reroute);
    }

    private ApplicationGatewayUrlConfigurationArgs() {}

    private ApplicationGatewayUrlConfigurationArgs(ApplicationGatewayUrlConfigurationArgs $) {
        this.modifiedPath = $.modifiedPath;
        this.modifiedQueryString = $.modifiedQueryString;
        this.reroute = $.reroute;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationGatewayUrlConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationGatewayUrlConfigurationArgs $;

        public Builder() {
            $ = new ApplicationGatewayUrlConfigurationArgs();
        }

        public Builder(ApplicationGatewayUrlConfigurationArgs defaults) {
            $ = new ApplicationGatewayUrlConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder modifiedPath(@Nullable Output<String> modifiedPath) {
            $.modifiedPath = modifiedPath;
            return this;
        }

        public Builder modifiedPath(String modifiedPath) {
            return modifiedPath(Output.of(modifiedPath));
        }

        public Builder modifiedQueryString(@Nullable Output<String> modifiedQueryString) {
            $.modifiedQueryString = modifiedQueryString;
            return this;
        }

        public Builder modifiedQueryString(String modifiedQueryString) {
            return modifiedQueryString(Output.of(modifiedQueryString));
        }

        public Builder reroute(@Nullable Output<Boolean> reroute) {
            $.reroute = reroute;
            return this;
        }

        public Builder reroute(Boolean reroute) {
            return reroute(Output.of(reroute));
        }

        public ApplicationGatewayUrlConfigurationArgs build() {
            return $;
        }
    }

}

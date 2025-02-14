// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.app.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the paths HTTP requests.
 * 
 */
public final class HttpSettingsRoutesArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpSettingsRoutesArgs Empty = new HttpSettingsRoutesArgs();

    /**
     * The prefix that should precede all the authentication/authorization paths.
     * 
     */
    @Import(name="apiPrefix")
    private @Nullable Output<String> apiPrefix;

    /**
     * @return The prefix that should precede all the authentication/authorization paths.
     * 
     */
    public Optional<Output<String>> apiPrefix() {
        return Optional.ofNullable(this.apiPrefix);
    }

    private HttpSettingsRoutesArgs() {}

    private HttpSettingsRoutesArgs(HttpSettingsRoutesArgs $) {
        this.apiPrefix = $.apiPrefix;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HttpSettingsRoutesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HttpSettingsRoutesArgs $;

        public Builder() {
            $ = new HttpSettingsRoutesArgs();
        }

        public Builder(HttpSettingsRoutesArgs defaults) {
            $ = new HttpSettingsRoutesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param apiPrefix The prefix that should precede all the authentication/authorization paths.
         * 
         * @return builder
         * 
         */
        public Builder apiPrefix(@Nullable Output<String> apiPrefix) {
            $.apiPrefix = apiPrefix;
            return this;
        }

        /**
         * @param apiPrefix The prefix that should precede all the authentication/authorization paths.
         * 
         * @return builder
         * 
         */
        public Builder apiPrefix(String apiPrefix) {
            return apiPrefix(Output.of(apiPrefix));
        }

        public HttpSettingsRoutesArgs build() {
            return $;
        }
    }

}

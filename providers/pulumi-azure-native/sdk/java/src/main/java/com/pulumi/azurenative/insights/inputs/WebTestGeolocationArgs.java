// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Geo-physical location to run a web test from. You must specify one or more locations for the test to run from.
 * 
 */
public final class WebTestGeolocationArgs extends ResourceArgs {

    public static final WebTestGeolocationArgs Empty = new WebTestGeolocationArgs();

    /**
     * Location ID for the webtest to run from.
     * 
     */
    @Import(name="location")
    private @Nullable Output<String> location;

    /**
     * @return Location ID for the webtest to run from.
     * 
     */
    public Optional<Output<String>> location() {
        return Optional.ofNullable(this.location);
    }

    private WebTestGeolocationArgs() {}

    private WebTestGeolocationArgs(WebTestGeolocationArgs $) {
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebTestGeolocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebTestGeolocationArgs $;

        public Builder() {
            $ = new WebTestGeolocationArgs();
        }

        public Builder(WebTestGeolocationArgs defaults) {
            $ = new WebTestGeolocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param location Location ID for the webtest to run from.
         * 
         * @return builder
         * 
         */
        public Builder location(@Nullable Output<String> location) {
            $.location = location;
            return this;
        }

        /**
         * @param location Location ID for the webtest to run from.
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            return location(Output.of(location));
        }

        public WebTestGeolocationArgs build() {
            return $;
        }
    }

}

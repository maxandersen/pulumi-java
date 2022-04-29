// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.botservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Facebook page for Facebook channel registration
 * 
 */
public final class FacebookPageArgs extends ResourceArgs {

    public static final FacebookPageArgs Empty = new FacebookPageArgs();

    /**
     * Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    @Import(name="accessToken")
    private @Nullable Output<String> accessToken;

    /**
     * @return Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    public Optional<Output<String>> accessToken() {
        return Optional.ofNullable(this.accessToken);
    }

    /**
     * Page id
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return Page id
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private FacebookPageArgs() {}

    private FacebookPageArgs(FacebookPageArgs $) {
        this.accessToken = $.accessToken;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FacebookPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FacebookPageArgs $;

        public Builder() {
            $ = new FacebookPageArgs();
        }

        public Builder(FacebookPageArgs defaults) {
            $ = new FacebookPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accessToken Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(@Nullable Output<String> accessToken) {
            $.accessToken = accessToken;
            return this;
        }

        /**
         * @param accessToken Facebook application access token. Value only returned through POST to the action Channel List API, otherwise empty.
         * 
         * @return builder
         * 
         */
        public Builder accessToken(String accessToken) {
            return accessToken(Output.of(accessToken));
        }

        /**
         * @param id Page id
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id Page id
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public FacebookPageArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}

// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.enums.DestinationProtocol;
import com.pulumi.azurenative.cdn.enums.RedirectType;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the parameters for the url redirect action.
 * 
 */
public final class UrlRedirectActionParametersArgs extends ResourceArgs {

    public static final UrlRedirectActionParametersArgs Empty = new UrlRedirectActionParametersArgs();

    /**
     * Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    @Import(name="customFragment")
    private @Nullable Output<String> customFragment;

    /**
     * @return Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
     * 
     */
    public Optional<Output<String>> customFragment() {
        return Optional.ofNullable(this.customFragment);
    }

    /**
     * Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    @Import(name="customHostname")
    private @Nullable Output<String> customHostname;

    /**
     * @return Host to redirect. Leave empty to use the incoming host as the destination host.
     * 
     */
    public Optional<Output<String>> customHostname() {
        return Optional.ofNullable(this.customHostname);
    }

    /**
     * The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    @Import(name="customPath")
    private @Nullable Output<String> customPath;

    /**
     * @return The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
     * 
     */
    public Optional<Output<String>> customPath() {
        return Optional.ofNullable(this.customPath);
    }

    /**
     * The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     * 
     */
    @Import(name="customQueryString")
    private @Nullable Output<String> customQueryString;

    /**
     * @return The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
     * 
     */
    public Optional<Output<String>> customQueryString() {
        return Optional.ofNullable(this.customQueryString);
    }

    /**
     * Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    @Import(name="destinationProtocol")
    private @Nullable Output<Either<String,DestinationProtocol>> destinationProtocol;

    /**
     * @return Protocol to use for the redirect. The default value is MatchRequest
     * 
     */
    public Optional<Output<Either<String,DestinationProtocol>>> destinationProtocol() {
        return Optional.ofNullable(this.destinationProtocol);
    }

    @Import(name="odataType", required=true)
    private Output<String> odataType;

    public Output<String> odataType() {
        return this.odataType;
    }

    /**
     * The redirect type the rule will use when redirecting traffic.
     * 
     */
    @Import(name="redirectType", required=true)
    private Output<Either<String,RedirectType>> redirectType;

    /**
     * @return The redirect type the rule will use when redirecting traffic.
     * 
     */
    public Output<Either<String,RedirectType>> redirectType() {
        return this.redirectType;
    }

    private UrlRedirectActionParametersArgs() {}

    private UrlRedirectActionParametersArgs(UrlRedirectActionParametersArgs $) {
        this.customFragment = $.customFragment;
        this.customHostname = $.customHostname;
        this.customPath = $.customPath;
        this.customQueryString = $.customQueryString;
        this.destinationProtocol = $.destinationProtocol;
        this.odataType = $.odataType;
        this.redirectType = $.redirectType;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UrlRedirectActionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UrlRedirectActionParametersArgs $;

        public Builder() {
            $ = new UrlRedirectActionParametersArgs();
        }

        public Builder(UrlRedirectActionParametersArgs defaults) {
            $ = new UrlRedirectActionParametersArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param customFragment Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
         * 
         * @return builder
         * 
         */
        public Builder customFragment(@Nullable Output<String> customFragment) {
            $.customFragment = customFragment;
            return this;
        }

        /**
         * @param customFragment Fragment to add to the redirect URL. Fragment is the part of the URL that comes after #. Do not include the #.
         * 
         * @return builder
         * 
         */
        public Builder customFragment(String customFragment) {
            return customFragment(Output.of(customFragment));
        }

        /**
         * @param customHostname Host to redirect. Leave empty to use the incoming host as the destination host.
         * 
         * @return builder
         * 
         */
        public Builder customHostname(@Nullable Output<String> customHostname) {
            $.customHostname = customHostname;
            return this;
        }

        /**
         * @param customHostname Host to redirect. Leave empty to use the incoming host as the destination host.
         * 
         * @return builder
         * 
         */
        public Builder customHostname(String customHostname) {
            return customHostname(Output.of(customHostname));
        }

        /**
         * @param customPath The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
         * 
         * @return builder
         * 
         */
        public Builder customPath(@Nullable Output<String> customPath) {
            $.customPath = customPath;
            return this;
        }

        /**
         * @param customPath The full path to redirect. Path cannot be empty and must start with /. Leave empty to use the incoming path as destination path.
         * 
         * @return builder
         * 
         */
        public Builder customPath(String customPath) {
            return customPath(Output.of(customPath));
        }

        /**
         * @param customQueryString The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
         * 
         * @return builder
         * 
         */
        public Builder customQueryString(@Nullable Output<String> customQueryString) {
            $.customQueryString = customQueryString;
            return this;
        }

        /**
         * @param customQueryString The set of query strings to be placed in the redirect URL. Setting this value would replace any existing query string; leave empty to preserve the incoming query string. Query string must be in &lt;key&gt;=&lt;value&gt; format. ? and &amp; will be added automatically so do not include them.
         * 
         * @return builder
         * 
         */
        public Builder customQueryString(String customQueryString) {
            return customQueryString(Output.of(customQueryString));
        }

        /**
         * @param destinationProtocol Protocol to use for the redirect. The default value is MatchRequest
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(@Nullable Output<Either<String,DestinationProtocol>> destinationProtocol) {
            $.destinationProtocol = destinationProtocol;
            return this;
        }

        /**
         * @param destinationProtocol Protocol to use for the redirect. The default value is MatchRequest
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(Either<String,DestinationProtocol> destinationProtocol) {
            return destinationProtocol(Output.of(destinationProtocol));
        }

        /**
         * @param destinationProtocol Protocol to use for the redirect. The default value is MatchRequest
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(String destinationProtocol) {
            return destinationProtocol(Either.ofLeft(destinationProtocol));
        }

        /**
         * @param destinationProtocol Protocol to use for the redirect. The default value is MatchRequest
         * 
         * @return builder
         * 
         */
        public Builder destinationProtocol(DestinationProtocol destinationProtocol) {
            return destinationProtocol(Either.ofRight(destinationProtocol));
        }

        public Builder odataType(Output<String> odataType) {
            $.odataType = odataType;
            return this;
        }

        public Builder odataType(String odataType) {
            return odataType(Output.of(odataType));
        }

        /**
         * @param redirectType The redirect type the rule will use when redirecting traffic.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(Output<Either<String,RedirectType>> redirectType) {
            $.redirectType = redirectType;
            return this;
        }

        /**
         * @param redirectType The redirect type the rule will use when redirecting traffic.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(Either<String,RedirectType> redirectType) {
            return redirectType(Output.of(redirectType));
        }

        /**
         * @param redirectType The redirect type the rule will use when redirecting traffic.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(String redirectType) {
            return redirectType(Either.ofLeft(redirectType));
        }

        /**
         * @param redirectType The redirect type the rule will use when redirecting traffic.
         * 
         * @return builder
         * 
         */
        public Builder redirectType(RedirectType redirectType) {
            return redirectType(Either.ofRight(redirectType));
        }

        public UrlRedirectActionParametersArgs build() {
            $.odataType = Objects.requireNonNull($.odataType, "expected parameter 'odataType' to be non-null");
            $.redirectType = Objects.requireNonNull($.redirectType, "expected parameter 'redirectType' to be non-null");
            return $;
        }
    }

}

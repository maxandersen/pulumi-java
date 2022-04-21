// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.enums.UnauthenticatedClientActionV2;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings that determines the validation flow of users using App Service Authentication/Authorization.
 * 
 */
public final class GlobalValidationArgs extends com.pulumi.resources.ResourceArgs {

    public static final GlobalValidationArgs Empty = new GlobalValidationArgs();

    /**
     * The paths for which unauthenticated flow would not be redirected to the login page.
     * 
     */
    @Import(name="excludedPaths")
    private @Nullable Output<List<String>> excludedPaths;

    public Optional<Output<List<String>>> excludedPaths() {
        return Optional.ofNullable(this.excludedPaths);
    }

    /**
     * The default authentication provider to use when multiple providers are configured.
     * This setting is only needed if multiple providers are configured and the unauthenticated client
     * action is set to &#34;RedirectToLoginPage&#34;.
     * 
     */
    @Import(name="redirectToProvider")
    private @Nullable Output<String> redirectToProvider;

    public Optional<Output<String>> redirectToProvider() {
        return Optional.ofNullable(this.redirectToProvider);
    }

    /**
     * &lt;code&gt;true&lt;/code&gt; if the authentication flow is required any request is made; otherwise, &lt;code&gt;false&lt;/code&gt;.
     * 
     */
    @Import(name="requireAuthentication")
    private @Nullable Output<Boolean> requireAuthentication;

    public Optional<Output<Boolean>> requireAuthentication() {
        return Optional.ofNullable(this.requireAuthentication);
    }

    /**
     * The action to take when an unauthenticated client attempts to access the app.
     * 
     */
    @Import(name="unauthenticatedClientAction")
    private @Nullable Output<UnauthenticatedClientActionV2> unauthenticatedClientAction;

    public Optional<Output<UnauthenticatedClientActionV2>> unauthenticatedClientAction() {
        return Optional.ofNullable(this.unauthenticatedClientAction);
    }

    private GlobalValidationArgs() {}

    private GlobalValidationArgs(GlobalValidationArgs $) {
        this.excludedPaths = $.excludedPaths;
        this.redirectToProvider = $.redirectToProvider;
        this.requireAuthentication = $.requireAuthentication;
        this.unauthenticatedClientAction = $.unauthenticatedClientAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GlobalValidationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GlobalValidationArgs $;

        public Builder() {
            $ = new GlobalValidationArgs();
        }

        public Builder(GlobalValidationArgs defaults) {
            $ = new GlobalValidationArgs(Objects.requireNonNull(defaults));
        }

        public Builder excludedPaths(@Nullable Output<List<String>> excludedPaths) {
            $.excludedPaths = excludedPaths;
            return this;
        }

        public Builder excludedPaths(List<String> excludedPaths) {
            return excludedPaths(Output.of(excludedPaths));
        }

        public Builder excludedPaths(String... excludedPaths) {
            return excludedPaths(List.of(excludedPaths));
        }

        public Builder redirectToProvider(@Nullable Output<String> redirectToProvider) {
            $.redirectToProvider = redirectToProvider;
            return this;
        }

        public Builder redirectToProvider(String redirectToProvider) {
            return redirectToProvider(Output.of(redirectToProvider));
        }

        public Builder requireAuthentication(@Nullable Output<Boolean> requireAuthentication) {
            $.requireAuthentication = requireAuthentication;
            return this;
        }

        public Builder requireAuthentication(Boolean requireAuthentication) {
            return requireAuthentication(Output.of(requireAuthentication));
        }

        public Builder unauthenticatedClientAction(@Nullable Output<UnauthenticatedClientActionV2> unauthenticatedClientAction) {
            $.unauthenticatedClientAction = unauthenticatedClientAction;
            return this;
        }

        public Builder unauthenticatedClientAction(UnauthenticatedClientActionV2 unauthenticatedClientAction) {
            return unauthenticatedClientAction(Output.of(unauthenticatedClientAction));
        }

        public GlobalValidationArgs build() {
            return $;
        }
    }

}

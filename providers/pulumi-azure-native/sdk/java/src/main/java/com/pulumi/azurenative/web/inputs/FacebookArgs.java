// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.inputs;

import com.pulumi.azurenative.web.inputs.AppRegistrationArgs;
import com.pulumi.azurenative.web.inputs.LoginScopesArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The configuration settings of the Facebook provider.
 * 
 */
public final class FacebookArgs extends com.pulumi.resources.ResourceArgs {

    public static final FacebookArgs Empty = new FacebookArgs();

    /**
     * &lt;code&gt;false&lt;/code&gt; if the Facebook provider should not be enabled despite the set registration; otherwise, &lt;code&gt;true&lt;/code&gt;.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The version of the Facebook api to be used while logging in.
     * 
     */
    @Import(name="graphApiVersion")
    private @Nullable Output<String> graphApiVersion;

    public Optional<Output<String>> graphApiVersion() {
        return Optional.ofNullable(this.graphApiVersion);
    }

    /**
     * The configuration settings of the login flow.
     * 
     */
    @Import(name="login")
    private @Nullable Output<LoginScopesArgs> login;

    public Optional<Output<LoginScopesArgs>> login() {
        return Optional.ofNullable(this.login);
    }

    /**
     * The configuration settings of the app registration for the Facebook provider.
     * 
     */
    @Import(name="registration")
    private @Nullable Output<AppRegistrationArgs> registration;

    public Optional<Output<AppRegistrationArgs>> registration() {
        return Optional.ofNullable(this.registration);
    }

    private FacebookArgs() {}

    private FacebookArgs(FacebookArgs $) {
        this.enabled = $.enabled;
        this.graphApiVersion = $.graphApiVersion;
        this.login = $.login;
        this.registration = $.registration;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FacebookArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FacebookArgs $;

        public Builder() {
            $ = new FacebookArgs();
        }

        public Builder(FacebookArgs defaults) {
            $ = new FacebookArgs(Objects.requireNonNull(defaults));
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder graphApiVersion(@Nullable Output<String> graphApiVersion) {
            $.graphApiVersion = graphApiVersion;
            return this;
        }

        public Builder graphApiVersion(String graphApiVersion) {
            return graphApiVersion(Output.of(graphApiVersion));
        }

        public Builder login(@Nullable Output<LoginScopesArgs> login) {
            $.login = login;
            return this;
        }

        public Builder login(LoginScopesArgs login) {
            return login(Output.of(login));
        }

        public Builder registration(@Nullable Output<AppRegistrationArgs> registration) {
            $.registration = registration;
            return this;
        }

        public Builder registration(AppRegistrationArgs registration) {
            return registration(Output.of(registration));
        }

        public FacebookArgs build() {
            return $;
        }
    }

}

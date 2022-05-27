// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appservice.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WindowsFunctionAppSiteCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final WindowsFunctionAppSiteCredentialArgs Empty = new WindowsFunctionAppSiteCredentialArgs();

    /**
     * The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The Site Credentials Password used for publishing.
     * 
     */
    @Import(name="password")
    private @Nullable Output<String> password;

    /**
     * @return The Site Credentials Password used for publishing.
     * 
     */
    public Optional<Output<String>> password() {
        return Optional.ofNullable(this.password);
    }

    private WindowsFunctionAppSiteCredentialArgs() {}

    private WindowsFunctionAppSiteCredentialArgs(WindowsFunctionAppSiteCredentialArgs $) {
        this.name = $.name;
        this.password = $.password;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WindowsFunctionAppSiteCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WindowsFunctionAppSiteCredentialArgs $;

        public Builder() {
            $ = new WindowsFunctionAppSiteCredentialArgs();
        }

        public Builder(WindowsFunctionAppSiteCredentialArgs defaults) {
            $ = new WindowsFunctionAppSiteCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name which should be used for this Windows Function App. Changing this forces a new Windows Function App to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param password The Site Credentials Password used for publishing.
         * 
         * @return builder
         * 
         */
        public Builder password(@Nullable Output<String> password) {
            $.password = password;
            return this;
        }

        /**
         * @param password The Site Credentials Password used for publishing.
         * 
         * @return builder
         * 
         */
        public Builder password(String password) {
            return password(Output.of(password));
        }

        public WindowsFunctionAppSiteCredentialArgs build() {
            return $;
        }
    }

}

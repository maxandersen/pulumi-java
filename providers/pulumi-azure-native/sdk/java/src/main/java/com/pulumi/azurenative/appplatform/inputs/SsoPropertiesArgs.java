// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Single sign-on related configuration
 * 
 */
public final class SsoPropertiesArgs extends ResourceArgs {

    public static final SsoPropertiesArgs Empty = new SsoPropertiesArgs();

    /**
     * The public identifier for the application
     * 
     */
    @Import(name="clientId")
    private @Nullable Output<String> clientId;

    /**
     * @return The public identifier for the application
     * 
     */
    public Optional<Output<String>> clientId() {
        return Optional.ofNullable(this.clientId);
    }

    /**
     * The secret known only to the application and the authorization server
     * 
     */
    @Import(name="clientSecret")
    private @Nullable Output<String> clientSecret;

    /**
     * @return The secret known only to the application and the authorization server
     * 
     */
    public Optional<Output<String>> clientSecret() {
        return Optional.ofNullable(this.clientSecret);
    }

    /**
     * The URI of Issuer Identifier
     * 
     */
    @Import(name="issuerUri")
    private @Nullable Output<String> issuerUri;

    /**
     * @return The URI of Issuer Identifier
     * 
     */
    public Optional<Output<String>> issuerUri() {
        return Optional.ofNullable(this.issuerUri);
    }

    /**
     * It defines the specific actions applications can be allowed to do on a user&#39;s behalf
     * 
     */
    @Import(name="scope")
    private @Nullable Output<List<String>> scope;

    /**
     * @return It defines the specific actions applications can be allowed to do on a user&#39;s behalf
     * 
     */
    public Optional<Output<List<String>>> scope() {
        return Optional.ofNullable(this.scope);
    }

    private SsoPropertiesArgs() {}

    private SsoPropertiesArgs(SsoPropertiesArgs $) {
        this.clientId = $.clientId;
        this.clientSecret = $.clientSecret;
        this.issuerUri = $.issuerUri;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SsoPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SsoPropertiesArgs $;

        public Builder() {
            $ = new SsoPropertiesArgs();
        }

        public Builder(SsoPropertiesArgs defaults) {
            $ = new SsoPropertiesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clientId The public identifier for the application
         * 
         * @return builder
         * 
         */
        public Builder clientId(@Nullable Output<String> clientId) {
            $.clientId = clientId;
            return this;
        }

        /**
         * @param clientId The public identifier for the application
         * 
         * @return builder
         * 
         */
        public Builder clientId(String clientId) {
            return clientId(Output.of(clientId));
        }

        /**
         * @param clientSecret The secret known only to the application and the authorization server
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            $.clientSecret = clientSecret;
            return this;
        }

        /**
         * @param clientSecret The secret known only to the application and the authorization server
         * 
         * @return builder
         * 
         */
        public Builder clientSecret(String clientSecret) {
            return clientSecret(Output.of(clientSecret));
        }

        /**
         * @param issuerUri The URI of Issuer Identifier
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(@Nullable Output<String> issuerUri) {
            $.issuerUri = issuerUri;
            return this;
        }

        /**
         * @param issuerUri The URI of Issuer Identifier
         * 
         * @return builder
         * 
         */
        public Builder issuerUri(String issuerUri) {
            return issuerUri(Output.of(issuerUri));
        }

        /**
         * @param scope It defines the specific actions applications can be allowed to do on a user&#39;s behalf
         * 
         * @return builder
         * 
         */
        public Builder scope(@Nullable Output<List<String>> scope) {
            $.scope = scope;
            return this;
        }

        /**
         * @param scope It defines the specific actions applications can be allowed to do on a user&#39;s behalf
         * 
         * @return builder
         * 
         */
        public Builder scope(List<String> scope) {
            return scope(Output.of(scope));
        }

        /**
         * @param scope It defines the specific actions applications can be allowed to do on a user&#39;s behalf
         * 
         * @return builder
         * 
         */
        public Builder scope(String... scope) {
            return scope(List.of(scope));
        }

        public SsoPropertiesArgs build() {
            return $;
        }
    }

}

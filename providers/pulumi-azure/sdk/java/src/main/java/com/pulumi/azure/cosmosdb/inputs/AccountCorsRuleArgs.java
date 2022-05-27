// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.cosmosdb.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AccountCorsRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final AccountCorsRuleArgs Empty = new AccountCorsRuleArgs();

    /**
     * A list of headers that are allowed to be a part of the cross-origin request.
     * 
     */
    @Import(name="allowedHeaders", required=true)
    private Output<List<String>> allowedHeaders;

    /**
     * @return A list of headers that are allowed to be a part of the cross-origin request.
     * 
     */
    public Output<List<String>> allowedHeaders() {
        return this.allowedHeaders;
    }

    /**
     * A list of HTTP headers that are allowed to be executed by the origin. Valid options are  `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
     * 
     */
    @Import(name="allowedMethods", required=true)
    private Output<List<String>> allowedMethods;

    /**
     * @return A list of HTTP headers that are allowed to be executed by the origin. Valid options are  `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
     * 
     */
    public Output<List<String>> allowedMethods() {
        return this.allowedMethods;
    }

    /**
     * A list of origin domains that will be allowed by CORS.
     * 
     */
    @Import(name="allowedOrigins", required=true)
    private Output<List<String>> allowedOrigins;

    /**
     * @return A list of origin domains that will be allowed by CORS.
     * 
     */
    public Output<List<String>> allowedOrigins() {
        return this.allowedOrigins;
    }

    /**
     * A list of response headers that are exposed to CORS clients.
     * 
     */
    @Import(name="exposedHeaders", required=true)
    private Output<List<String>> exposedHeaders;

    /**
     * @return A list of response headers that are exposed to CORS clients.
     * 
     */
    public Output<List<String>> exposedHeaders() {
        return this.exposedHeaders;
    }

    /**
     * The number of seconds the client should cache a preflight response.
     * 
     */
    @Import(name="maxAgeInSeconds", required=true)
    private Output<Integer> maxAgeInSeconds;

    /**
     * @return The number of seconds the client should cache a preflight response.
     * 
     */
    public Output<Integer> maxAgeInSeconds() {
        return this.maxAgeInSeconds;
    }

    private AccountCorsRuleArgs() {}

    private AccountCorsRuleArgs(AccountCorsRuleArgs $) {
        this.allowedHeaders = $.allowedHeaders;
        this.allowedMethods = $.allowedMethods;
        this.allowedOrigins = $.allowedOrigins;
        this.exposedHeaders = $.exposedHeaders;
        this.maxAgeInSeconds = $.maxAgeInSeconds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AccountCorsRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AccountCorsRuleArgs $;

        public Builder() {
            $ = new AccountCorsRuleArgs();
        }

        public Builder(AccountCorsRuleArgs defaults) {
            $ = new AccountCorsRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param allowedHeaders A list of headers that are allowed to be a part of the cross-origin request.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(Output<List<String>> allowedHeaders) {
            $.allowedHeaders = allowedHeaders;
            return this;
        }

        /**
         * @param allowedHeaders A list of headers that are allowed to be a part of the cross-origin request.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(List<String> allowedHeaders) {
            return allowedHeaders(Output.of(allowedHeaders));
        }

        /**
         * @param allowedHeaders A list of headers that are allowed to be a part of the cross-origin request.
         * 
         * @return builder
         * 
         */
        public Builder allowedHeaders(String... allowedHeaders) {
            return allowedHeaders(List.of(allowedHeaders));
        }

        /**
         * @param allowedMethods A list of HTTP headers that are allowed to be executed by the origin. Valid options are  `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(Output<List<String>> allowedMethods) {
            $.allowedMethods = allowedMethods;
            return this;
        }

        /**
         * @param allowedMethods A list of HTTP headers that are allowed to be executed by the origin. Valid options are  `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(List<String> allowedMethods) {
            return allowedMethods(Output.of(allowedMethods));
        }

        /**
         * @param allowedMethods A list of HTTP headers that are allowed to be executed by the origin. Valid options are  `DELETE`, `GET`, `HEAD`, `MERGE`, `POST`, `OPTIONS`, `PUT` or `PATCH`.
         * 
         * @return builder
         * 
         */
        public Builder allowedMethods(String... allowedMethods) {
            return allowedMethods(List.of(allowedMethods));
        }

        /**
         * @param allowedOrigins A list of origin domains that will be allowed by CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(Output<List<String>> allowedOrigins) {
            $.allowedOrigins = allowedOrigins;
            return this;
        }

        /**
         * @param allowedOrigins A list of origin domains that will be allowed by CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(List<String> allowedOrigins) {
            return allowedOrigins(Output.of(allowedOrigins));
        }

        /**
         * @param allowedOrigins A list of origin domains that will be allowed by CORS.
         * 
         * @return builder
         * 
         */
        public Builder allowedOrigins(String... allowedOrigins) {
            return allowedOrigins(List.of(allowedOrigins));
        }

        /**
         * @param exposedHeaders A list of response headers that are exposed to CORS clients.
         * 
         * @return builder
         * 
         */
        public Builder exposedHeaders(Output<List<String>> exposedHeaders) {
            $.exposedHeaders = exposedHeaders;
            return this;
        }

        /**
         * @param exposedHeaders A list of response headers that are exposed to CORS clients.
         * 
         * @return builder
         * 
         */
        public Builder exposedHeaders(List<String> exposedHeaders) {
            return exposedHeaders(Output.of(exposedHeaders));
        }

        /**
         * @param exposedHeaders A list of response headers that are exposed to CORS clients.
         * 
         * @return builder
         * 
         */
        public Builder exposedHeaders(String... exposedHeaders) {
            return exposedHeaders(List.of(exposedHeaders));
        }

        /**
         * @param maxAgeInSeconds The number of seconds the client should cache a preflight response.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeInSeconds(Output<Integer> maxAgeInSeconds) {
            $.maxAgeInSeconds = maxAgeInSeconds;
            return this;
        }

        /**
         * @param maxAgeInSeconds The number of seconds the client should cache a preflight response.
         * 
         * @return builder
         * 
         */
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            return maxAgeInSeconds(Output.of(maxAgeInSeconds));
        }

        public AccountCorsRuleArgs build() {
            $.allowedHeaders = Objects.requireNonNull($.allowedHeaders, "expected parameter 'allowedHeaders' to be non-null");
            $.allowedMethods = Objects.requireNonNull($.allowedMethods, "expected parameter 'allowedMethods' to be non-null");
            $.allowedOrigins = Objects.requireNonNull($.allowedOrigins, "expected parameter 'allowedOrigins' to be non-null");
            $.exposedHeaders = Objects.requireNonNull($.exposedHeaders, "expected parameter 'exposedHeaders' to be non-null");
            $.maxAgeInSeconds = Objects.requireNonNull($.maxAgeInSeconds, "expected parameter 'maxAgeInSeconds' to be non-null");
            return $;
        }
    }

}

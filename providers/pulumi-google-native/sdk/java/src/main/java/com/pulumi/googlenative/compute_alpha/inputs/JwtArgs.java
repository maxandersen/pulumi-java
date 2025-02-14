// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_alpha.inputs.JwtHeaderArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * [Deprecated] JWT configuration for origin authentication. JWT configuration for origin authentication.
 * 
 */
public final class JwtArgs extends com.pulumi.resources.ResourceArgs {

    public static final JwtArgs Empty = new JwtArgs();

    /**
     * A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    @Import(name="audiences")
    private @Nullable Output<List<String>> audiences;

    /**
     * @return A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
     * 
     */
    public Optional<Output<List<String>>> audiences() {
        return Optional.ofNullable(this.audiences);
    }

    /**
     * Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
     * 
     */
    @Import(name="issuer")
    private @Nullable Output<String> issuer;

    /**
     * @return Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
     * 
     */
    public Optional<Output<String>> issuer() {
        return Optional.ofNullable(this.issuer);
    }

    /**
     * The provider&#39;s public key set to validate the signature of the JWT.
     * 
     */
    @Import(name="jwksPublicKeys")
    private @Nullable Output<String> jwksPublicKeys;

    /**
     * @return The provider&#39;s public key set to validate the signature of the JWT.
     * 
     */
    public Optional<Output<String>> jwksPublicKeys() {
        return Optional.ofNullable(this.jwksPublicKeys);
    }

    /**
     * jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
     * 
     */
    @Import(name="jwtHeaders")
    private @Nullable Output<List<JwtHeaderArgs>> jwtHeaders;

    /**
     * @return jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
     * 
     */
    public Optional<Output<List<JwtHeaderArgs>>> jwtHeaders() {
        return Optional.ofNullable(this.jwtHeaders);
    }

    /**
     * This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
     * 
     */
    @Import(name="jwtParams")
    private @Nullable Output<List<String>> jwtParams;

    /**
     * @return This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
     * 
     */
    public Optional<Output<List<String>>> jwtParams() {
        return Optional.ofNullable(this.jwtParams);
    }

    private JwtArgs() {}

    private JwtArgs(JwtArgs $) {
        this.audiences = $.audiences;
        this.issuer = $.issuer;
        this.jwksPublicKeys = $.jwksPublicKeys;
        this.jwtHeaders = $.jwtHeaders;
        this.jwtParams = $.jwtParams;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(JwtArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JwtArgs $;

        public Builder() {
            $ = new JwtArgs();
        }

        public Builder(JwtArgs defaults) {
            $ = new JwtArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param audiences A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(@Nullable Output<List<String>> audiences) {
            $.audiences = audiences;
            return this;
        }

        /**
         * @param audiences A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(List<String> audiences) {
            return audiences(Output.of(audiences));
        }

        /**
         * @param audiences A JWT containing any of these audiences will be accepted. The service name will be accepted if audiences is empty. Examples: bookstore_android.apps.googleusercontent.com, bookstore_web.apps.googleusercontent.com
         * 
         * @return builder
         * 
         */
        public Builder audiences(String... audiences) {
            return audiences(List.of(audiences));
        }

        /**
         * @param issuer Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder issuer(@Nullable Output<String> issuer) {
            $.issuer = issuer;
            return this;
        }

        /**
         * @param issuer Identifies the issuer that issued the JWT, which is usually a URL or an email address. Examples: https://securetoken.google.com, 1234567-compute@developer.gserviceaccount.com
         * 
         * @return builder
         * 
         */
        public Builder issuer(String issuer) {
            return issuer(Output.of(issuer));
        }

        /**
         * @param jwksPublicKeys The provider&#39;s public key set to validate the signature of the JWT.
         * 
         * @return builder
         * 
         */
        public Builder jwksPublicKeys(@Nullable Output<String> jwksPublicKeys) {
            $.jwksPublicKeys = jwksPublicKeys;
            return this;
        }

        /**
         * @param jwksPublicKeys The provider&#39;s public key set to validate the signature of the JWT.
         * 
         * @return builder
         * 
         */
        public Builder jwksPublicKeys(String jwksPublicKeys) {
            return jwksPublicKeys(Output.of(jwksPublicKeys));
        }

        /**
         * @param jwtHeaders jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
         * 
         * @return builder
         * 
         */
        public Builder jwtHeaders(@Nullable Output<List<JwtHeaderArgs>> jwtHeaders) {
            $.jwtHeaders = jwtHeaders;
            return this;
        }

        /**
         * @param jwtHeaders jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
         * 
         * @return builder
         * 
         */
        public Builder jwtHeaders(List<JwtHeaderArgs> jwtHeaders) {
            return jwtHeaders(Output.of(jwtHeaders));
        }

        /**
         * @param jwtHeaders jwt_headers and jwt_params define where to extract the JWT from an HTTP request. If no explicit location is specified, the following default locations are tried in order: 1. The Authorization header using the Bearer schema. See ` here  `_. Example: Authorization: Bearer . 2. `access_token` query parameter. See ` this  `_ Multiple JWTs can be verified for a request. Each JWT has to be extracted from the locations its issuer specified or from the default locations. This field is set if JWT is sent in a request header. This field specifies the header name. For example, if `header=x-goog-iap-jwt-assertion`, the header format will be x-goog-iap-jwt-assertion: .
         * 
         * @return builder
         * 
         */
        public Builder jwtHeaders(JwtHeaderArgs... jwtHeaders) {
            return jwtHeaders(List.of(jwtHeaders));
        }

        /**
         * @param jwtParams This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
         * 
         * @return builder
         * 
         */
        public Builder jwtParams(@Nullable Output<List<String>> jwtParams) {
            $.jwtParams = jwtParams;
            return this;
        }

        /**
         * @param jwtParams This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
         * 
         * @return builder
         * 
         */
        public Builder jwtParams(List<String> jwtParams) {
            return jwtParams(Output.of(jwtParams));
        }

        /**
         * @param jwtParams This field is set if JWT is sent in a query parameter. This field specifies the query parameter name. For example, if jwt_params[0] is jwt_token, the JWT format in the query parameter is /path?jwt_token=.
         * 
         * @return builder
         * 
         */
        public Builder jwtParams(String... jwtParams) {
            return jwtParams(List.of(jwtParams));
        }

        public JwtArgs build() {
            return $;
        }
    }

}

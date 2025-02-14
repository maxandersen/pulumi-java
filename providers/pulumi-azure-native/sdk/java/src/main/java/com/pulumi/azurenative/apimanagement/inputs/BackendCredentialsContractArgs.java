// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.BackendAuthorizationHeaderCredentialsArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of the Credentials used to connect to Backend.
 * 
 */
public final class BackendCredentialsContractArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendCredentialsContractArgs Empty = new BackendCredentialsContractArgs();

    /**
     * Authorization header authentication
     * 
     */
    @Import(name="authorization")
    private @Nullable Output<BackendAuthorizationHeaderCredentialsArgs> authorization;

    /**
     * @return Authorization header authentication
     * 
     */
    public Optional<Output<BackendAuthorizationHeaderCredentialsArgs>> authorization() {
        return Optional.ofNullable(this.authorization);
    }

    /**
     * List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<List<String>> certificate;

    /**
     * @return List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
     * 
     */
    public Optional<Output<List<String>>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * List of Client Certificate Ids.
     * 
     */
    @Import(name="certificateIds")
    private @Nullable Output<List<String>> certificateIds;

    /**
     * @return List of Client Certificate Ids.
     * 
     */
    public Optional<Output<List<String>>> certificateIds() {
        return Optional.ofNullable(this.certificateIds);
    }

    /**
     * Header Parameter description.
     * 
     */
    @Import(name="header")
    private @Nullable Output<Map<String,List<String>>> header;

    /**
     * @return Header Parameter description.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> header() {
        return Optional.ofNullable(this.header);
    }

    /**
     * Query Parameter description.
     * 
     */
    @Import(name="query")
    private @Nullable Output<Map<String,List<String>>> query;

    /**
     * @return Query Parameter description.
     * 
     */
    public Optional<Output<Map<String,List<String>>>> query() {
        return Optional.ofNullable(this.query);
    }

    private BackendCredentialsContractArgs() {}

    private BackendCredentialsContractArgs(BackendCredentialsContractArgs $) {
        this.authorization = $.authorization;
        this.certificate = $.certificate;
        this.certificateIds = $.certificateIds;
        this.header = $.header;
        this.query = $.query;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendCredentialsContractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendCredentialsContractArgs $;

        public Builder() {
            $ = new BackendCredentialsContractArgs();
        }

        public Builder(BackendCredentialsContractArgs defaults) {
            $ = new BackendCredentialsContractArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param authorization Authorization header authentication
         * 
         * @return builder
         * 
         */
        public Builder authorization(@Nullable Output<BackendAuthorizationHeaderCredentialsArgs> authorization) {
            $.authorization = authorization;
            return this;
        }

        /**
         * @param authorization Authorization header authentication
         * 
         * @return builder
         * 
         */
        public Builder authorization(BackendAuthorizationHeaderCredentialsArgs authorization) {
            return authorization(Output.of(authorization));
        }

        /**
         * @param certificate List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<List<String>> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
         * 
         * @return builder
         * 
         */
        public Builder certificate(List<String> certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificate List of Client Certificate Thumbprints. Will be ignored if certificatesIds are provided.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String... certificate) {
            return certificate(List.of(certificate));
        }

        /**
         * @param certificateIds List of Client Certificate Ids.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(@Nullable Output<List<String>> certificateIds) {
            $.certificateIds = certificateIds;
            return this;
        }

        /**
         * @param certificateIds List of Client Certificate Ids.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(List<String> certificateIds) {
            return certificateIds(Output.of(certificateIds));
        }

        /**
         * @param certificateIds List of Client Certificate Ids.
         * 
         * @return builder
         * 
         */
        public Builder certificateIds(String... certificateIds) {
            return certificateIds(List.of(certificateIds));
        }

        /**
         * @param header Header Parameter description.
         * 
         * @return builder
         * 
         */
        public Builder header(@Nullable Output<Map<String,List<String>>> header) {
            $.header = header;
            return this;
        }

        /**
         * @param header Header Parameter description.
         * 
         * @return builder
         * 
         */
        public Builder header(Map<String,List<String>> header) {
            return header(Output.of(header));
        }

        /**
         * @param query Query Parameter description.
         * 
         * @return builder
         * 
         */
        public Builder query(@Nullable Output<Map<String,List<String>>> query) {
            $.query = query;
            return this;
        }

        /**
         * @param query Query Parameter description.
         * 
         * @return builder
         * 
         */
        public Builder query(Map<String,List<String>> query) {
            return query(Output.of(query));
        }

        public BackendCredentialsContractArgs build() {
            return $;
        }
    }

}

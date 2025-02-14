// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.insights.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTestResultFileArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTestResultFileArgs Empty = new GetTestResultFileArgs();

    /**
     * The continuation token.
     * 
     */
    @Import(name="continuationToken")
    private @Nullable String continuationToken;

    /**
     * @return The continuation token.
     * 
     */
    public Optional<String> continuationToken() {
        return Optional.ofNullable(this.continuationToken);
    }

    /**
     * The format to use when returning the webtest result.
     * 
     */
    @Import(name="downloadAs", required=true)
    private String downloadAs;

    /**
     * @return The format to use when returning the webtest result.
     * 
     */
    public String downloadAs() {
        return this.downloadAs;
    }

    /**
     * The location ID where the webtest was physically run.
     * 
     */
    @Import(name="geoLocationId", required=true)
    private String geoLocationId;

    /**
     * @return The location ID where the webtest was physically run.
     * 
     */
    public String geoLocationId() {
        return this.geoLocationId;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    /**
     * @return The name of the resource group. The name is case insensitive.
     * 
     */
    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The success state criteria for the webtest result.
     * 
     */
    @Import(name="testSuccessfulCriteria")
    private @Nullable Boolean testSuccessfulCriteria;

    /**
     * @return The success state criteria for the webtest result.
     * 
     */
    public Optional<Boolean> testSuccessfulCriteria() {
        return Optional.ofNullable(this.testSuccessfulCriteria);
    }

    /**
     * The posix (epoch) time stamp for the webtest result.
     * 
     */
    @Import(name="timeStamp", required=true)
    private Integer timeStamp;

    /**
     * @return The posix (epoch) time stamp for the webtest result.
     * 
     */
    public Integer timeStamp() {
        return this.timeStamp;
    }

    /**
     * The name of the Application Insights webtest resource.
     * 
     */
    @Import(name="webTestName", required=true)
    private String webTestName;

    /**
     * @return The name of the Application Insights webtest resource.
     * 
     */
    public String webTestName() {
        return this.webTestName;
    }

    private GetTestResultFileArgs() {}

    private GetTestResultFileArgs(GetTestResultFileArgs $) {
        this.continuationToken = $.continuationToken;
        this.downloadAs = $.downloadAs;
        this.geoLocationId = $.geoLocationId;
        this.resourceGroupName = $.resourceGroupName;
        this.testSuccessfulCriteria = $.testSuccessfulCriteria;
        this.timeStamp = $.timeStamp;
        this.webTestName = $.webTestName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTestResultFileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTestResultFileArgs $;

        public Builder() {
            $ = new GetTestResultFileArgs();
        }

        public Builder(GetTestResultFileArgs defaults) {
            $ = new GetTestResultFileArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param continuationToken The continuation token.
         * 
         * @return builder
         * 
         */
        public Builder continuationToken(@Nullable String continuationToken) {
            $.continuationToken = continuationToken;
            return this;
        }

        /**
         * @param downloadAs The format to use when returning the webtest result.
         * 
         * @return builder
         * 
         */
        public Builder downloadAs(String downloadAs) {
            $.downloadAs = downloadAs;
            return this;
        }

        /**
         * @param geoLocationId The location ID where the webtest was physically run.
         * 
         * @return builder
         * 
         */
        public Builder geoLocationId(String geoLocationId) {
            $.geoLocationId = geoLocationId;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group. The name is case insensitive.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param testSuccessfulCriteria The success state criteria for the webtest result.
         * 
         * @return builder
         * 
         */
        public Builder testSuccessfulCriteria(@Nullable Boolean testSuccessfulCriteria) {
            $.testSuccessfulCriteria = testSuccessfulCriteria;
            return this;
        }

        /**
         * @param timeStamp The posix (epoch) time stamp for the webtest result.
         * 
         * @return builder
         * 
         */
        public Builder timeStamp(Integer timeStamp) {
            $.timeStamp = timeStamp;
            return this;
        }

        /**
         * @param webTestName The name of the Application Insights webtest resource.
         * 
         * @return builder
         * 
         */
        public Builder webTestName(String webTestName) {
            $.webTestName = webTestName;
            return this;
        }

        public GetTestResultFileArgs build() {
            $.downloadAs = Objects.requireNonNull($.downloadAs, "expected parameter 'downloadAs' to be non-null");
            $.geoLocationId = Objects.requireNonNull($.geoLocationId, "expected parameter 'geoLocationId' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.timeStamp = Objects.requireNonNull($.timeStamp, "expected parameter 'timeStamp' to be non-null");
            $.webTestName = Objects.requireNonNull($.webTestName, "expected parameter 'webTestName' to be non-null");
            return $;
        }
    }

}

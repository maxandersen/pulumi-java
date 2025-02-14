// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.portal.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConsoleWithLocationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetConsoleWithLocationArgs Empty = new GetConsoleWithLocationArgs();

    /**
     * The name of the console
     * 
     */
    @Import(name="consoleName", required=true)
    private String consoleName;

    /**
     * @return The name of the console
     * 
     */
    public String consoleName() {
        return this.consoleName;
    }

    /**
     * The provider location
     * 
     */
    @Import(name="location", required=true)
    private String location;

    /**
     * @return The provider location
     * 
     */
    public String location() {
        return this.location;
    }

    private GetConsoleWithLocationArgs() {}

    private GetConsoleWithLocationArgs(GetConsoleWithLocationArgs $) {
        this.consoleName = $.consoleName;
        this.location = $.location;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetConsoleWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetConsoleWithLocationArgs $;

        public Builder() {
            $ = new GetConsoleWithLocationArgs();
        }

        public Builder(GetConsoleWithLocationArgs defaults) {
            $ = new GetConsoleWithLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param consoleName The name of the console
         * 
         * @return builder
         * 
         */
        public Builder consoleName(String consoleName) {
            $.consoleName = consoleName;
            return this;
        }

        /**
         * @param location The provider location
         * 
         * @return builder
         * 
         */
        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public GetConsoleWithLocationArgs build() {
            $.consoleName = Objects.requireNonNull($.consoleName, "expected parameter 'consoleName' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}

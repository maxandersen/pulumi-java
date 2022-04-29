// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.azurenative.machinelearningservices.enums.DataBindingMode;
import com.pulumi.core.Either;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputDataBindingArgs extends ResourceArgs {

    public static final OutputDataBindingArgs Empty = new OutputDataBindingArgs();

    /**
     * ARM resource ID of the datastore where the data output will be stored.
     * 
     */
    @Import(name="datastoreId")
    private @Nullable Output<String> datastoreId;

    /**
     * @return ARM resource ID of the datastore where the data output will be stored.
     * 
     */
    public Optional<Output<String>> datastoreId() {
        return Optional.ofNullable(this.datastoreId);
    }

    /**
     * Mechanism for data movement to datastore.
     * 
     */
    @Import(name="mode")
    private @Nullable Output<Either<String,DataBindingMode>> mode;

    /**
     * @return Mechanism for data movement to datastore.
     * 
     */
    public Optional<Output<Either<String,DataBindingMode>>> mode() {
        return Optional.ofNullable(this.mode);
    }

    /**
     * Location of data inside the container process.
     * 
     */
    @Import(name="pathOnCompute")
    private @Nullable Output<String> pathOnCompute;

    /**
     * @return Location of data inside the container process.
     * 
     */
    public Optional<Output<String>> pathOnCompute() {
        return Optional.ofNullable(this.pathOnCompute);
    }

    /**
     * Path within the datastore to the data.
     * 
     */
    @Import(name="pathOnDatastore")
    private @Nullable Output<String> pathOnDatastore;

    /**
     * @return Path within the datastore to the data.
     * 
     */
    public Optional<Output<String>> pathOnDatastore() {
        return Optional.ofNullable(this.pathOnDatastore);
    }

    private OutputDataBindingArgs() {}

    private OutputDataBindingArgs(OutputDataBindingArgs $) {
        this.datastoreId = $.datastoreId;
        this.mode = $.mode;
        this.pathOnCompute = $.pathOnCompute;
        this.pathOnDatastore = $.pathOnDatastore;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputDataBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputDataBindingArgs $;

        public Builder() {
            $ = new OutputDataBindingArgs();
        }

        public Builder(OutputDataBindingArgs defaults) {
            $ = new OutputDataBindingArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param datastoreId ARM resource ID of the datastore where the data output will be stored.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(@Nullable Output<String> datastoreId) {
            $.datastoreId = datastoreId;
            return this;
        }

        /**
         * @param datastoreId ARM resource ID of the datastore where the data output will be stored.
         * 
         * @return builder
         * 
         */
        public Builder datastoreId(String datastoreId) {
            return datastoreId(Output.of(datastoreId));
        }

        /**
         * @param mode Mechanism for data movement to datastore.
         * 
         * @return builder
         * 
         */
        public Builder mode(@Nullable Output<Either<String,DataBindingMode>> mode) {
            $.mode = mode;
            return this;
        }

        /**
         * @param mode Mechanism for data movement to datastore.
         * 
         * @return builder
         * 
         */
        public Builder mode(Either<String,DataBindingMode> mode) {
            return mode(Output.of(mode));
        }

        /**
         * @param mode Mechanism for data movement to datastore.
         * 
         * @return builder
         * 
         */
        public Builder mode(String mode) {
            return mode(Either.ofLeft(mode));
        }

        /**
         * @param mode Mechanism for data movement to datastore.
         * 
         * @return builder
         * 
         */
        public Builder mode(DataBindingMode mode) {
            return mode(Either.ofRight(mode));
        }

        /**
         * @param pathOnCompute Location of data inside the container process.
         * 
         * @return builder
         * 
         */
        public Builder pathOnCompute(@Nullable Output<String> pathOnCompute) {
            $.pathOnCompute = pathOnCompute;
            return this;
        }

        /**
         * @param pathOnCompute Location of data inside the container process.
         * 
         * @return builder
         * 
         */
        public Builder pathOnCompute(String pathOnCompute) {
            return pathOnCompute(Output.of(pathOnCompute));
        }

        /**
         * @param pathOnDatastore Path within the datastore to the data.
         * 
         * @return builder
         * 
         */
        public Builder pathOnDatastore(@Nullable Output<String> pathOnDatastore) {
            $.pathOnDatastore = pathOnDatastore;
            return this;
        }

        /**
         * @param pathOnDatastore Path within the datastore to the data.
         * 
         * @return builder
         * 
         */
        public Builder pathOnDatastore(String pathOnDatastore) {
            return pathOnDatastore(Output.of(pathOnDatastore));
        }

        public OutputDataBindingArgs build() {
            return $;
        }
    }

}

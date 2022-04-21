// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.inputs;

import com.pulumi.aws.glue.inputs.UserDefinedFunctionResourceUriGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UserDefinedFunctionState extends com.pulumi.resources.ResourceArgs {

    public static final UserDefinedFunctionState Empty = new UserDefinedFunctionState();

    @Import(name="arn")
    private @Nullable Output<String> arn;

    public Optional<Output<String>> arn() {
        return Optional.ofNullable(this.arn);
    }

    /**
     * ID of the Glue Catalog to create the function in. If omitted, this defaults to the AWS Account ID.
     * 
     */
    @Import(name="catalogId")
    private @Nullable Output<String> catalogId;

    public Optional<Output<String>> catalogId() {
        return Optional.ofNullable(this.catalogId);
    }

    /**
     * The Java class that contains the function code.
     * 
     */
    @Import(name="className")
    private @Nullable Output<String> className;

    public Optional<Output<String>> className() {
        return Optional.ofNullable(this.className);
    }

    @Import(name="createTime")
    private @Nullable Output<String> createTime;

    public Optional<Output<String>> createTime() {
        return Optional.ofNullable(this.createTime);
    }

    /**
     * The name of the Database to create the Function.
     * 
     */
    @Import(name="databaseName")
    private @Nullable Output<String> databaseName;

    public Optional<Output<String>> databaseName() {
        return Optional.ofNullable(this.databaseName);
    }

    /**
     * The name of the function.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The owner of the function.
     * 
     */
    @Import(name="ownerName")
    private @Nullable Output<String> ownerName;

    public Optional<Output<String>> ownerName() {
        return Optional.ofNullable(this.ownerName);
    }

    /**
     * The owner type. can be one of `USER`, `ROLE`, and `GROUP`.
     * 
     */
    @Import(name="ownerType")
    private @Nullable Output<String> ownerType;

    public Optional<Output<String>> ownerType() {
        return Optional.ofNullable(this.ownerType);
    }

    /**
     * The configuration block for Resource URIs. See resource uris below for more details.
     * 
     */
    @Import(name="resourceUris")
    private @Nullable Output<List<UserDefinedFunctionResourceUriGetArgs>> resourceUris;

    public Optional<Output<List<UserDefinedFunctionResourceUriGetArgs>>> resourceUris() {
        return Optional.ofNullable(this.resourceUris);
    }

    private UserDefinedFunctionState() {}

    private UserDefinedFunctionState(UserDefinedFunctionState $) {
        this.arn = $.arn;
        this.catalogId = $.catalogId;
        this.className = $.className;
        this.createTime = $.createTime;
        this.databaseName = $.databaseName;
        this.name = $.name;
        this.ownerName = $.ownerName;
        this.ownerType = $.ownerType;
        this.resourceUris = $.resourceUris;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(UserDefinedFunctionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserDefinedFunctionState $;

        public Builder() {
            $ = new UserDefinedFunctionState();
        }

        public Builder(UserDefinedFunctionState defaults) {
            $ = new UserDefinedFunctionState(Objects.requireNonNull(defaults));
        }

        public Builder arn(@Nullable Output<String> arn) {
            $.arn = arn;
            return this;
        }

        public Builder arn(String arn) {
            return arn(Output.of(arn));
        }

        public Builder catalogId(@Nullable Output<String> catalogId) {
            $.catalogId = catalogId;
            return this;
        }

        public Builder catalogId(String catalogId) {
            return catalogId(Output.of(catalogId));
        }

        public Builder className(@Nullable Output<String> className) {
            $.className = className;
            return this;
        }

        public Builder className(String className) {
            return className(Output.of(className));
        }

        public Builder createTime(@Nullable Output<String> createTime) {
            $.createTime = createTime;
            return this;
        }

        public Builder createTime(String createTime) {
            return createTime(Output.of(createTime));
        }

        public Builder databaseName(@Nullable Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder ownerName(@Nullable Output<String> ownerName) {
            $.ownerName = ownerName;
            return this;
        }

        public Builder ownerName(String ownerName) {
            return ownerName(Output.of(ownerName));
        }

        public Builder ownerType(@Nullable Output<String> ownerType) {
            $.ownerType = ownerType;
            return this;
        }

        public Builder ownerType(String ownerType) {
            return ownerType(Output.of(ownerType));
        }

        public Builder resourceUris(@Nullable Output<List<UserDefinedFunctionResourceUriGetArgs>> resourceUris) {
            $.resourceUris = resourceUris;
            return this;
        }

        public Builder resourceUris(List<UserDefinedFunctionResourceUriGetArgs> resourceUris) {
            return resourceUris(Output.of(resourceUris));
        }

        public Builder resourceUris(UserDefinedFunctionResourceUriGetArgs... resourceUris) {
            return resourceUris(List.of(resourceUris));
        }

        public UserDefinedFunctionState build() {
            return $;
        }
    }

}

USE [ChildCare]
GO
/****** Object:  Table [dbo].[Cart]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Cart](
	[cart_id] [int] NOT NULL,
	[created_date] [date] NULL,
	[updated_at] [date] NULL,
	[quantity] [int] NULL,
	[total_price] [int] NULL,
	[reservation_id] [int] NULL,
	[Users_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[cart_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Category]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Category](
	[category_id] [int] NOT NULL,
	[category_name] [varchar](50) NOT NULL,
	[icon] [varchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[category_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Creator]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Creator](
	[created_by] [int] NOT NULL,
	[Users_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[created_by] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Feedback]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Feedback](
	[feedback_id] [int] NOT NULL,
	[created_by] [int] NULL,
	[created_at] [date] NULL,
	[updated_at] [date] NULL,
	[reservation_id] [int] NULL,
	[content] [int] NULL,
	[star_no] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[feedback_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Post]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Post](
	[post_id] [int] NOT NULL,
	[title] [varchar](50) NULL,
	[category_id] [int] NULL,
	[image] [char](50) NULL,
	[description] [varchar](50) NULL,
	[updated_at] [date] NULL,
	[created_at] [date] NULL,
	[created_by] [int] NULL,
	[status_id] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[post_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[ReservationInformation]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ReservationInformation](
	[reservation_id] [int] NOT NULL,
	[service_id] [int] NULL,
	[service_quantity] [int] NULL,
	[number_of_staff] [int] NULL,
	[role_id] [int] NULL,
	[total_price] [int] NULL,
	[created_at] [date] NULL,
	[updated_at] [date] NULL,
	[status_id] [int] NULL,
	[checkup_at] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[reservation_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Role]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Role](
	[role_id] [int] NOT NULL,
	[role_name] [varchar](50) NULL,
	[role_avatar] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[role_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Service]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Service](
	[service_id] [int] NOT NULL,
	[title] [varchar](50) NULL,
	[category_id] [int] NULL,
	[image] [char](50) NULL,
	[original_price] [int] NULL,
	[sale_price] [int] NULL,
	[create_at] [date] NULL,
	[updated_at] [date] NULL,
	[description] [varchar](500) NULL,
PRIMARY KEY CLUSTERED 
(
	[service_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[StatusData]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[StatusData](
	[status_id] [int] NOT NULL,
	[status_name] [varchar](50) NULL,
PRIMARY KEY CLUSTERED 
(
	[status_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 10/3/2021 4:10:06 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[users_id] [int] NOT NULL,
	[first_name] [varchar](50) NULL,
	[last_name] [varchar](50) NULL,
	[gender] [bit] NULL,
	[email] [varchar](50) NULL,
	[phone] [varchar](50) NULL,
	[address] [varchar](50) NULL,
	[created_at] [date] NULL,
	[role_id] [int] NULL,
	[status_id] [int] NULL,
	[dob] [date] NULL,
PRIMARY KEY CLUSTERED 
(
	[users_id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_CartReservation] FOREIGN KEY([reservation_id])
REFERENCES [dbo].[ReservationInformation] ([reservation_id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_CartReservation]
GO
ALTER TABLE [dbo].[Cart]  WITH CHECK ADD  CONSTRAINT [FK_CartUser] FOREIGN KEY([Users_id])
REFERENCES [dbo].[Users] ([users_id])
GO
ALTER TABLE [dbo].[Cart] CHECK CONSTRAINT [FK_CartUser]
GO
ALTER TABLE [dbo].[Creator]  WITH CHECK ADD  CONSTRAINT [FK_CreatorUser] FOREIGN KEY([Users_id])
REFERENCES [dbo].[Users] ([users_id])
GO
ALTER TABLE [dbo].[Creator] CHECK CONSTRAINT [FK_CreatorUser]
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD FOREIGN KEY([created_by])
REFERENCES [dbo].[Creator] ([created_by])
GO
ALTER TABLE [dbo].[Feedback]  WITH CHECK ADD FOREIGN KEY([reservation_id])
REFERENCES [dbo].[ReservationInformation] ([reservation_id])
GO
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_PostCreatedby] FOREIGN KEY([created_by])
REFERENCES [dbo].[Creator] ([created_by])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_PostCreatedby]
GO
ALTER TABLE [dbo].[Post]  WITH CHECK ADD  CONSTRAINT [FK_PostStatus] FOREIGN KEY([status_id])
REFERENCES [dbo].[StatusData] ([status_id])
GO
ALTER TABLE [dbo].[Post] CHECK CONSTRAINT [FK_PostStatus]
GO
ALTER TABLE [dbo].[ReservationInformation]  WITH CHECK ADD  CONSTRAINT [FK_ReservationRole] FOREIGN KEY([role_id])
REFERENCES [dbo].[Role] ([role_id])
GO
ALTER TABLE [dbo].[ReservationInformation] CHECK CONSTRAINT [FK_ReservationRole]
GO
ALTER TABLE [dbo].[ReservationInformation]  WITH CHECK ADD  CONSTRAINT [FK_ReservationService] FOREIGN KEY([service_id])
REFERENCES [dbo].[Service] ([service_id])
GO
ALTER TABLE [dbo].[ReservationInformation] CHECK CONSTRAINT [FK_ReservationService]
GO
ALTER TABLE [dbo].[ReservationInformation]  WITH CHECK ADD  CONSTRAINT [FK_ReservationStatus] FOREIGN KEY([status_id])
REFERENCES [dbo].[StatusData] ([status_id])
GO
ALTER TABLE [dbo].[ReservationInformation] CHECK CONSTRAINT [FK_ReservationStatus]
GO
ALTER TABLE [dbo].[Service]  WITH CHECK ADD  CONSTRAINT [FK_ServiceCategory] FOREIGN KEY([category_id])
REFERENCES [dbo].[Category] ([category_id])
GO
ALTER TABLE [dbo].[Service] CHECK CONSTRAINT [FK_ServiceCategory]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_UserRole] FOREIGN KEY([role_id])
REFERENCES [dbo].[Role] ([role_id])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_UserRole]
GO
ALTER TABLE [dbo].[Users]  WITH CHECK ADD  CONSTRAINT [FK_UserStatus] FOREIGN KEY([status_id])
REFERENCES [dbo].[StatusData] ([status_id])
GO
ALTER TABLE [dbo].[Users] CHECK CONSTRAINT [FK_UserStatus]
GO
